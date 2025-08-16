package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.Sticker.Format;
import ru.ravel.rtelebots.response.GetFileResponse;
import ru.ravel.rtelebots.response.GetFileResponse;

/**
 * Stas Parshin
 * 23 July 2017
 */
public class UploadStickerFile extends AbstractUploadRequest<UploadStickerFile, GetFileResponse> {

	/**
	 * @param stickerFormat must be one of “static”, “animated”, “video”.
	 */
	public UploadStickerFile(Long userId, Object sticker, Format stickerFormat) {
		super(GetFileResponse.class, "sticker", sticker);
		add("user_id", userId);
		add("sticker_format", stickerFormat.name().toLowerCase());
	}


}
