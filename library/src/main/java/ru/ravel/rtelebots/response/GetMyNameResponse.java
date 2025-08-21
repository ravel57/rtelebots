package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.BotName;

import java.util.Objects;

public class GetMyNameResponse extends BaseResponse {

	private BotName result;

	public BotName botName() {
		return result;
	}

	@Override
	public String toString() {
		return "GetMyNameResponse{" +
				"result=" + result +
				'}';
	}
}
