package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.UserChatBoostsResponse;
import ru.ravel.rtelebots.response.UserChatBoostsResponse;

public class GetUserChatBoosts extends BaseRequest<GetUserChatBoosts, UserChatBoostsResponse> {

	public GetUserChatBoosts(Object chatId, Long userId) {
		super(UserChatBoostsResponse.class);
		add("chat_id", chatId).add("user_id", userId);
	}
}
