package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 12 October 2017
 */
public class DeleteChatStickerSet extends BaseRequest<DeleteChatStickerSet, BaseResponse> {

	public DeleteChatStickerSet(Object chatId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
	}
}
