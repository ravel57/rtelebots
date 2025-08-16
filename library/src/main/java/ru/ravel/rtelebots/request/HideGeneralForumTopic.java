package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

public class HideGeneralForumTopic extends BaseRequest<HideGeneralForumTopic, BaseResponse> {

	public HideGeneralForumTopic(Long chatId) {
		this(chatId.toString());
	}

	public HideGeneralForumTopic(String chatId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
	}

}
