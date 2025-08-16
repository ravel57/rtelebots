package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.MenuButton;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class GetChatMenuButtonResponse extends BaseResponse {

	private MenuButton result;

	public MenuButton result() {
		return result;
	}

	@Override
	public String toString() {
		return "GetChatMenuButtonResponse{" +
				"result=" + result +
				'}';
	}

}
