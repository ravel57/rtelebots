package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.MenuButton;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class SetChatMenuButton extends BaseRequest<SetChatMenuButton, BaseResponse> {

	public SetChatMenuButton() {
		super(BaseResponse.class);
	}

	public SetChatMenuButton chatId(long chatId) {
		return add("chat_id", chatId);
	}

	public SetChatMenuButton menuButton(MenuButton menuButton) {
		return add("menu_button", menuButton);
	}

}
