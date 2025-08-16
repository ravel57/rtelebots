package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 01 July 2017
 */
public class SetChatDescription extends BaseRequest<SetChatDescription, BaseResponse> {

	public SetChatDescription(Object chatId, String description) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("description", description);
	}
}
