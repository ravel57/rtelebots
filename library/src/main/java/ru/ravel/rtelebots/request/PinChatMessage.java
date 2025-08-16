package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 01 July 2017
 */
public class PinChatMessage extends BaseRequest<PinChatMessage, BaseResponse> {

	public PinChatMessage(Object chatId, int messageId) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
	}

	public PinChatMessage disableNotification(boolean disableNotification) {
		return add("disable_notification", disableNotification);
	}

	public PinChatMessage businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}

}
