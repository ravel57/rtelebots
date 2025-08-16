package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 05 November 2020
 */
public class LogOut extends BaseRequest<LogOut, BaseResponse> {

	public LogOut() {
		super(BaseResponse.class);
	}
}
