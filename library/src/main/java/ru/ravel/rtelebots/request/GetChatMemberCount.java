package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetChatMemberCountResponse;
import ru.ravel.rtelebots.response.GetChatMemberCountResponse;

public class GetChatMemberCount extends BaseRequest<GetChatMemberCount, GetChatMemberCountResponse> {

	public GetChatMemberCount(Object chatId) {
		super(GetChatMemberCountResponse.class);
		add("chat_id", chatId);
	}
}