package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.botcommandscope.BotCommandScope;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class DeleteMyCommands extends BaseRequest<DeleteMyCommands, BaseResponse> {
	public DeleteMyCommands() {
		super(BaseResponse.class);
	}

	public DeleteMyCommands scope(BotCommandScope scope) {
		this.add("scope", scope);
		return this;
	}

	public DeleteMyCommands languageCode(String languageCode) {
		this.add("language_code", languageCode);
		return this;
	}
}
