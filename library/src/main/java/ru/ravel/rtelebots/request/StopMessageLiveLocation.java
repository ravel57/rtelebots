package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.request.InlineKeyboardMarkup;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SendResponse;

/**
 * Stas Parshin
 * 12 October 2017
 */
public class StopMessageLiveLocation extends BaseRequest<StopMessageLiveLocation, BaseResponse> {

	public StopMessageLiveLocation(Object chatId, int messageId) {
		super(SendResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
	}

	public StopMessageLiveLocation(String inlineMessageId) {
		super(BaseResponse.class);
		add("inline_message_id", inlineMessageId);
	}

	public StopMessageLiveLocation replyMarkup(InlineKeyboardMarkup replyMarkup) {
		return add("reply_markup", replyMarkup);
	}

	public StopMessageLiveLocation businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}
}
