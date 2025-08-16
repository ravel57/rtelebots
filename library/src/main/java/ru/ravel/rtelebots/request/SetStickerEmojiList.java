package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;


public class SetStickerEmojiList extends BaseRequest<SetStickerEmojiList, BaseResponse> {

	/**
	 * @param sticker   File identifier of the sticker
	 * @param emojiList A list of 1-20 emoji associated with the sticker
	 */
	public SetStickerEmojiList(String sticker, String[] emojiList) {
		super(BaseResponse.class);
		add("sticker", sticker);
		add("emoji_list", emojiList);
	}

}
