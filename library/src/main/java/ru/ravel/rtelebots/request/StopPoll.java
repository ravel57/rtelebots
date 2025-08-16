package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.request.Keyboard;
import ru.ravel.rtelebots.response.PollResponse;

/**
 * Stas Parshin
 * 17 April 2019
 */
public class StopPoll extends BaseRequest<StopPoll, PollResponse> {

	public StopPoll(Object chatId, int messageId) {
		super(PollResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
	}

	public StopPoll replyMarkup(Keyboard replyMarkup) {
		return add("reply_markup", replyMarkup);
	}

	public StopPoll businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}
}
