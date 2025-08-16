package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Mirco Ianese
 * 17 Nov 2021
 */
public class ApproveChatJoinRequest extends BaseRequest<ApproveChatJoinRequest, BaseResponse> {

	/**
	 * @param chatId Unique identifier for the target chat or username of the target channel (in the format @channelusername)
	 * @param userId Unique identifier of the target user
	 */
	public ApproveChatJoinRequest(Object chatId, Long userId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("user_id", userId);
	}

}
