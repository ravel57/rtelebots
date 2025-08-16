package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.MaskPosition;
import ru.ravel.rtelebots.model.request.InputSticker;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 23 July 2017
 */
public class AddStickerToSet extends AbstractUploadRequest<AddStickerToSet, BaseResponse> {

	public AddStickerToSet(Long userId, String name, InputSticker sticker) {
		super(BaseResponse.class, attachName(sticker), attachment(sticker));
		add("user_id", userId);
		add("name", name);
		add("sticker", sticker);
	}

	private static String attachName(InputSticker sticker) {
		return sticker.getAttachment() != null ? sticker.getAttachName() : "sticker_id";
	}

	private static Object attachment(InputSticker sticker) {
		return sticker.getAttachment() != null ? sticker.getAttachment() : "sticker_id";
	}
}
