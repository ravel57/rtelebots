package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class CloseForumTopic extends BaseRequest<CloseForumTopic, BaseResponse> {

	public CloseForumTopic(Long chatId, Integer messageThreadId) {
		this(chatId.toString(), messageThreadId);
	}

	public CloseForumTopic(String chatId, Integer messageThreadId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
	}
}