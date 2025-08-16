package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

public class CloseGeneralForumTopic extends BaseRequest<CloseGeneralForumTopic, BaseResponse> {

	public CloseGeneralForumTopic(Long chatId) {
		this(chatId.toString());
	}

	public CloseGeneralForumTopic(String chatId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
	}

}
