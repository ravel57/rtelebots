package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.BotShortDescription;

import java.util.Objects;

public class GetMyShortDescriptionResponse extends BaseResponse {

	private BotShortDescription result;

	public BotShortDescription botShortDescription() {
		return result;
	}

	@Override
	public String toString() {
		return "GetMyShortDescriptionResponse{" +
				"result=" + Objects.toString(result) +
				'}';
	}
}
