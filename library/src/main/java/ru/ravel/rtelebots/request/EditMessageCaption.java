package ru.ravel.rtelebots.request;

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
public class EditMessageCaption extends BaseRequest<EditMessageCaption, BaseResponse> {

	public EditMessageCaption(Object chatId, int messageId) {
		super(SendResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
	}

	public EditMessageCaption(String inlineMessageId) {
		super(BaseResponse.class);
		add("inline_message_id", inlineMessageId);
	}

	public EditMessageCaption caption(String caption) {
		return add("caption", caption);
	}

	public EditMessageCaption parseMode(ParseMode parseMode) {
		return add("parse_mode", parseMode.name());
	}

	public EditMessageCaption captionEntities(MessageEntity... entities) {
		return add("caption_entities", entities);
	}

	public EditMessageCaption replyMarkup(InlineKeyboardMarkup replyMarkup) {
		return add("reply_markup", replyMarkup);
	}

	public EditMessageCaption showCaptionAboveMedia(Boolean showCaptionAboveMedia) {
		return add("show_caption_above_media", showCaptionAboveMedia);
	}

	public EditMessageCaption businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}

}
