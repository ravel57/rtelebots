package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Mirco Ianese
 * 07 December 2021
 */
public class BanChatSenderChat extends BaseRequest<BanChatSenderChat, BaseResponse> {

	public BanChatSenderChat(Object chatId, long sender_chat_id) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("sender_chat_id", sender_chat_id);
	}
}
