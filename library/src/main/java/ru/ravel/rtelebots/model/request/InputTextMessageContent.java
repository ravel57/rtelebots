package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.model.LinkPreviewOptions;
import ru.ravel.rtelebots.model.MessageEntity;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class InputTextMessageContent extends InputMessageContent implements Serializable {
	private final static long serialVersionUID = 0L;

	private final String message_text;
	private String parse_mode;
	private LinkPreviewOptions link_preview_options;
	private Boolean disable_web_page_preview;
	private MessageEntity[] entities;

	public InputTextMessageContent(String messageText) {
		this.message_text = messageText;
	}

	public InputTextMessageContent parseMode(ParseMode parseMode) {
		this.parse_mode = parseMode.name();
		return this;
	}

	public InputTextMessageContent entities(MessageEntity... entities) {
		this.entities = entities;
		return this;
	}

	public InputTextMessageContent linkPreviewOptions(LinkPreviewOptions linkPreviewOptions) {
		this.link_preview_options = linkPreviewOptions;
		return this;
	}
}
