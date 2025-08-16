package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.ChatPermissions;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 30 July 2019
 */
public class SetChatPermissions extends BaseRequest<SetChatPermissions, BaseResponse> {

	public SetChatPermissions(Object chatId, ChatPermissions permissions) {
		super(BaseResponse.class);
		add("chat_id", chatId).add("permissions", permissions);
	}

	public SetChatPermissions useIndependentChatPermissions(boolean useIndependentChatPermissions) {
		return add("use_independent_chat_permissions", useIndependentChatPermissions);
	}
}
