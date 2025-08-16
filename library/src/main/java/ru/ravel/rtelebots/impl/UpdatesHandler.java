package ru.ravel.rtelebots.impl;

import ru.ravel.rtelebots.*;
import ru.ravel.rtelebots.model.Update;
import ru.ravel.rtelebots.request.GetUpdates;
import ru.ravel.rtelebots.response.GetUpdatesResponse;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Stas Parshin
 * 29 September 2016
 */
public class UpdatesHandler {

	private TelegramBot bot;
	private UpdatesListener listener;
	private ExceptionHandler exceptionHandler;
	private Cancellable pendingRequest;

	private final long sleepTimeout;

	public UpdatesHandler(long sleepTimeout) {
		this.sleepTimeout = sleepTimeout;
	}

	public void start(TelegramBot bot, UpdatesListener listener, ExceptionHandler exceptionHandler, GetUpdates request) {
		this.bot = bot;
		this.listener = listener;
		this.exceptionHandler = exceptionHandler;
		getUpdates(request);
	}

	public void stop() {
		bot = null;
		listener = null;
		exceptionHandler = null;
		if (pendingRequest != null) {
			pendingRequest.cancel();
			pendingRequest = null;
		}
	}

	private void getUpdates(GetUpdates request) {
		if (bot == null || listener == null) return;

		pendingRequest = bot.execute(request, new Callback<GetUpdates, GetUpdatesResponse>() {
			@Override
			public void onResponse(GetUpdates request, GetUpdatesResponse response) {
				if (listener == null) return;

				if (!response.isOk() || response.updates() == null || response.updates().size() <= 0) {
					if (!response.isOk()) {
						if (exceptionHandler != null) {
							String message = "GetUpdates failed with error_code " +
									response.errorCode() + " " + response.description();
							exceptionHandler.onException(new TelegramException(message, response));
						} else {
							Logger.getGlobal().log(Level.INFO,
									"Update listener error for request " + request.toWebhookResponse() +
											" with response " + response.errorCode() + " " + response.description());
						}
					}
					sleep();
					getUpdates(request);
					return;
				}

				List<Update> updates = response.updates();
				if (updates == null) updates = Collections.emptyList();
				int lastConfirmedUpdate = listener.process(updates);

				if (lastConfirmedUpdate != UpdatesListener.CONFIRMED_UPDATES_NONE) {
					int offset = lastConfirmedUpdate == UpdatesListener.CONFIRMED_UPDATES_ALL
							? lastUpdateId(updates) + 1
							: lastConfirmedUpdate + 1;
					request = request.offset(offset);
				}
				getUpdates(request);
			}

			@Override
			public void onFailure(GetUpdates request, IOException e) {
				// TODO: better way to identify canceled request
				if (e.getMessage().equals("Canceled")) {
					return;
				}
				if (exceptionHandler != null) {
					exceptionHandler.onException(new TelegramException(e));
				} else {
					Logger.getGlobal().log(Level.INFO, "Update listener failure", e);
				}
				sleep();
				getUpdates(request);
			}
		});
	}

	private int lastUpdateId(List<Update> updates) {
		return updates.get(updates.size() - 1).updateId();
	}

	private void sleep() {
		if (sleepTimeout <= 0L) return;
		try {
			Thread.sleep(sleepTimeout);
		} catch (InterruptedException ignored) {
		}
	}
}
