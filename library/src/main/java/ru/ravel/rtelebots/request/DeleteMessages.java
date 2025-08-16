package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class DeleteMessages extends BaseRequest<DeleteMessages, BaseResponse> {

	public DeleteMessages(Object chatId, int[] messageIds) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("message_ids", messageIds);
	}
}
