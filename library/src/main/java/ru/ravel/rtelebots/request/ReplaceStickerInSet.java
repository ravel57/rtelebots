package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.request.InputSticker;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class ReplaceStickerInSet extends BaseRequest<ReplaceStickerInSet, BaseResponse> {

	public ReplaceStickerInSet(Long userId, String name, String oldSticker, InputSticker sticker) {
		super(BaseResponse.class);
		add("user_id", userId);
		add("name", name);
		add("old_sticker", oldSticker);
		add("sticker", sticker);
	}

}
