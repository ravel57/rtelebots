package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

public class UnpinAllForumTopicMessages extends BaseRequest<UnpinAllForumTopicMessages, BaseResponse> {

	public UnpinAllForumTopicMessages(Long chatId, Integer messageThreadId) {
		this(chatId.toString(), messageThreadId);
	}

	public UnpinAllForumTopicMessages(String chatId, Integer messageThreadId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
	}
}