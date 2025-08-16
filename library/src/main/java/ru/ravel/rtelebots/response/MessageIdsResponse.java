package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.MessageId;

import java.util.Arrays;

/**
 * Stas Parshin
 * 06 November 2020
 */
public class MessageIdsResponse extends BaseResponse {

	private MessageId[] result;

	public MessageId[] result() {
		return result;
	}

	@Override
	public String toString() {
		return "MessageIdsResponse{" +
				"result=" + Arrays.toString(result) +
				'}';
	}
}
