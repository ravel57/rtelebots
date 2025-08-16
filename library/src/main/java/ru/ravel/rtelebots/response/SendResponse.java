package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.Message;

/**
 * stas
 * 8/5/15.
 */
public class SendResponse extends BaseResponse {

	private Message result;

	SendResponse() {
	}

	public Message message() {
		return result;
	}

	@Override
	public String toString() {
		return "SendResponse{" +
				"result=" + result +
				'}';
	}
}
