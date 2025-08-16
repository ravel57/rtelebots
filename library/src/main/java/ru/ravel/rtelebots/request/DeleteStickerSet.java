package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;


public class DeleteStickerSet extends BaseRequest<DeleteStickerSet, BaseResponse> {

	/**
	 * @param name Sticker set name
	 */
	public DeleteStickerSet(String name) {
		super(BaseResponse.class);
		add("name", name);
	}

}
