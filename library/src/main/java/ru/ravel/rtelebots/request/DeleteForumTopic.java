package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class DeleteForumTopic extends BaseRequest<DeleteForumTopic, BaseResponse> {

	public DeleteForumTopic(Long chatId, Integer messageThreadId) {
		this(chatId.toString(), messageThreadId);
	}

	public DeleteForumTopic(String chatId, Integer messageThreadId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
	}
}