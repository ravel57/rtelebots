package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.request.InlineKeyboardMarkup;
import ru.ravel.rtelebots.model.request.InputMedia;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SendResponse;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SendResponse;

import java.util.Map;

/**
 * Stas Parshin
 * 28 July 2018
 */
public class EditMessageMedia extends BaseRequest<EditMessageMedia, BaseResponse> {

	private boolean isMultipart;
	private InputMedia<?> media;

	public EditMessageMedia(Object chatId, int messageId, InputMedia<?> media) {
		super(SendResponse.class);
		add("chat_id", chatId).add("message_id", messageId);
		addMedia(media);
	}

	public EditMessageMedia(String inlineMessageId, InputMedia<?> media) {
		super(BaseResponse.class);
		add("inline_message_id", inlineMessageId);
		addMedia(media);
	}

	private void addMedia(InputMedia<?> media) {
		this.media = media;
		add("media", media);
		Map<String, Object> attachments = media.getAttachments();
		if (attachments != null && attachments.size() > 0) {
			addAll(attachments);
			isMultipart = true;
		}
		if (media.inputFile() != null) {
			add(media.getInputFileId(), media.inputFile());
			isMultipart = true;
		}
	}

	public EditMessageMedia replyMarkup(InlineKeyboardMarkup replyMarkup) {
		return add("reply_markup", replyMarkup);
	}

	public EditMessageMedia businessConnectionId(String businessConnectionId) {
		return add("business_connection_id", businessConnectionId);
	}

	@Override
	public boolean isMultipart() {
		return isMultipart;
	}

	@Override
	public String getFileName() {
		return media.getFileName();
	}

	@Override
	public String getContentType() {
		return media.getContentType();
	}
}
