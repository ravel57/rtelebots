package ru.ravel.rtelebots.builder;

import ru.ravel.rtelebots.TelegramBot;
import ru.ravel.rtelebots.request.DeleteMessage;

public class DeleteMessageBuilder extends MessageBuilder {

	private Integer messageId;


	public DeleteMessageBuilder(TelegramBot bot) {
		super(bot);
	}

	public DeleteMessageBuilder telegramId(Long telegramId) {
		this.telegramId = telegramId;
		return this;
	}

	public DeleteMessageBuilder messageId(Integer messageId) {
		this.messageId = messageId;
		return this;
	}

	public void execute() throws NoSuchFieldException {
		if (telegramId == null || this.messageId == null) {
			throw new NoSuchFieldException();
		}
		DeleteMessage message = new DeleteMessage(telegramId, this.messageId);

		bot.execute(message);
	}

}