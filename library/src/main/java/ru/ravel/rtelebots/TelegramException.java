package ru.ravel.rtelebots;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 17 June 2019
 */
public class TelegramException extends Exception {
	private BaseResponse response;

	public TelegramException(String message, BaseResponse response) {
		super(message);
		this.response = response;
	}

	public TelegramException(Exception e) {
		super(e);
	}

	public BaseResponse response() {
		return response;
	}
}
