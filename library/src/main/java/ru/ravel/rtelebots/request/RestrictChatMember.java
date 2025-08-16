package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.ChatPermissions;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 01 July 2017
 */
public class RestrictChatMember extends BaseRequest<RestrictChatMember, BaseResponse> {

	public RestrictChatMember(Object chatId, long userId, ChatPermissions permissions) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("user_id", userId).add("permissions", permissions);
	}

	public RestrictChatMember untilDate(int untilDate) {
		return add("until_date", untilDate);
	}

	public RestrictChatMember useIndependentChatPermissions(boolean useIndependentChatPermissions) {
		return add("use_independent_chat_permissions", useIndependentChatPermissions);
	}
}
