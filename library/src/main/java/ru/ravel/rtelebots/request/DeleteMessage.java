package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 22 May 2017
 */
public class DeleteMessage extends BaseRequest<DeleteMessage, BaseResponse> {

	public DeleteMessage(Object chatId, int messageId) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
	}
}
