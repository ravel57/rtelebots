package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.Sticker;

import java.util.Arrays;

/**
 * Mirco Ianese
 * 16 Aug 2022
 */
public class GetCustomEmojiStickersResponse extends BaseResponse {

	private Sticker[] result;

	public Sticker[] result() {
		return result;
	}

	@Override
	public String toString() {
		return "GetCustomEmojiStickersResponse{" +
				"result=" + Arrays.toString(result) +
				'}';
	}
}
