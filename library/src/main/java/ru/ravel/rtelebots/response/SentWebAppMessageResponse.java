package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.SentWebAppMessage;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class SentWebAppMessageResponse extends BaseResponse {

	private SentWebAppMessage result;

	public SentWebAppMessage sentWebAppMessage() {
		return result;
	}

	@Override
	public String toString() {
		return "SentWebAppMessageResponse{" +
				"result=" + result +
				'}';
	}
}
