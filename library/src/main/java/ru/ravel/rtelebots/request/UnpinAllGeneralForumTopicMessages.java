package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * 22 August 2023
 */
public class UnpinAllGeneralForumTopicMessages extends BaseRequest<UnpinAllGeneralForumTopicMessages, BaseResponse> {

	public UnpinAllGeneralForumTopicMessages(Long chatId) {
		this(chatId.toString());
	}

	public UnpinAllGeneralForumTopicMessages(String chatId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
	}

}
