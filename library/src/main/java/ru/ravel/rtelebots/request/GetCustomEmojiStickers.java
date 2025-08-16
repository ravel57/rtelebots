package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetCustomEmojiStickersResponse;

/**
 * Mirco Ianese
 * 16 Aug 2022
 */
public class GetCustomEmojiStickers extends BaseRequest<GetCustomEmojiStickers, GetCustomEmojiStickersResponse> {

	public GetCustomEmojiStickers(String... custom_emoji_ids) {
		super(GetCustomEmojiStickersResponse.class);
		add("custom_emoji_ids", custom_emoji_ids);
	}
}
