package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.LinkPreviewOptions;
import ru.ravel.rtelebots.model.MessageEntity;
import ru.ravel.rtelebots.model.request.InlineKeyboardMarkup;
import ru.ravel.rtelebots.model.request.ParseMode;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SendResponse;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SendResponse;

/**
 * Stas Parshin
 * 07 May 2016
 */
public class EditMessageText extends BaseRequest<EditMessageText, BaseResponse> {

	public EditMessageText(Object chatId, int messageId, String text) {
		super(SendResponse.class);
		add("chat_id", chatId).add("message_id", messageId).add("text", text);
	}

	public EditMessageText(String inlineMessageId, String text) {
		super(BaseResponse.class);
		add("inline_message_id", inlineMessageId).add("text", text);
	}

	public EditMessageText parseMode(ParseMode parseMode) {
		return add("parse_mode", parseMode.name());
	}

	public EditMessageText entities(MessageEntity... entities) {
		return add("entities", entities);
	}

	public EditMessageText linkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
		return add("link_preview_options", linkPreviewOptions);
	}

	public EditMessageText replyMarkup(InlineKeyboardMarkup replyMarkup) {
		return add("reply_markup", replyMarkup);
	}

	public EditMessageText businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}

}
