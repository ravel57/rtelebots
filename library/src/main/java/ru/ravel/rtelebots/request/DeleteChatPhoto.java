package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 01 July 2017
 */
public class DeleteChatPhoto extends BaseRequest<DeleteChatPhoto, BaseResponse> {

	public DeleteChatPhoto(Object chatId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
	}
}
