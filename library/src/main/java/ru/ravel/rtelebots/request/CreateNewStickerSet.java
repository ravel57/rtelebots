package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.Sticker.Type;
import ru.ravel.rtelebots.model.request.InputSticker;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 23 July 2017
 */
public class CreateNewStickerSet extends BaseRequest<CreateNewStickerSet, BaseResponse> {

	public CreateNewStickerSet(Long userId, String name, String title, InputSticker[] stickers) {
		super(BaseResponse.class);
		add("user_id", userId);
		add("name", name);
		add("title", title);
		add("stickers", stickers);
		for (InputSticker sticker : stickers) {
			if (sticker.getAttachment() != null) {
				add(sticker.getAttachName(), sticker.getAttachment());
			}
		}
	}

	@Override
	public boolean isMultipart() {
		return true;
	}


	/**
	 * Type of stickers in the set.
	 *
	 * @param stickerType Type of stickers in the set, pass “regular”, “mask”, or “custom_emoji”. By default, a regular sticker set is created.
	 * @return a CreateNewStickerSet object
	 */
	public CreateNewStickerSet stickerType(Type stickerType) {
		return add("sticker_type", stickerType.name());
	}

	/**
	 * @param needsRepainting Pass True if stickers in the sticker set must be repainted to the color of text when used in messages, the accent color if used as emoji status, white on chat photos, or another appropriate color based on context; for custom emoji sticker sets only.
	 * @return a CreateNewStickerSet object
	 */
	public CreateNewStickerSet needsRepainting(boolean needsRepainting) {
		return add("needs_repainting", needsRepainting);
	}
}
