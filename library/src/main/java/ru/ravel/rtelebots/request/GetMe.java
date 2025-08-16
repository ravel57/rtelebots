package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetMeResponse;

/**
 * stas
 * 5/1/16.
 */
public class GetMe extends BaseRequest<GetMe, GetMeResponse> {

	public GetMe() {
		super(GetMeResponse.class);
	}
}
