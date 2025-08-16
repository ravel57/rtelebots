package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetMyDescriptionResponse;
import ru.ravel.rtelebots.response.GetMyDescriptionResponse;

public class GetMyDescription extends BaseRequest<GetMyDescription, GetMyDescriptionResponse> {

	public GetMyDescription() {
		super(GetMyDescriptionResponse.class);
	}

	/**
	 * @param languageCode A two-letter ISO 639-1 language code or an empty string
	 * @return
	 */
	public GetMyDescription languageCode(String languageCode) {
		add("language_code", languageCode);
		return this;
	}
}
