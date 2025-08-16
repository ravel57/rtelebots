package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class ReopenForumTopic extends BaseRequest<ReopenForumTopic, BaseResponse> {

	public ReopenForumTopic(Long chatId, Integer messageThreadId) {
		this(chatId.toString(), messageThreadId);
	}

	public ReopenForumTopic(String chatId, Integer messageThreadId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
	}
}