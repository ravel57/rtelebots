package ru.ravel.rtelebots.passport;

import ru.ravel.rtelebots.request.BaseRequest;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 30 July 2018
 */
public class SetPassportDataErrors extends BaseRequest<SetPassportDataErrors, BaseResponse> {

	public SetPassportDataErrors(long userId, PassportElementError... errors) {
		super(BaseResponse.class);
		add("user_id", userId).add("errors", errors);
	}
}
