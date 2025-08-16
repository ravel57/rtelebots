package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.BotDescription;

import java.util.Objects;

public class GetMyDescriptionResponse extends BaseResponse {

	private BotDescription result;

	public BotDescription botDescription() {
		return result;
	}

	@Override
	public String toString() {
		return "GetMyDescriptionResponse{" +
				"result=" + Objects.toString(result) +
				'}';
	}
}
