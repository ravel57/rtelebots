package ru.ravel.rtelebots.model.request;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class InlineQueryResultDocument extends InlineQueryResult<InlineQueryResultDocument> implements Serializable {
	private final static long serialVersionUID = 0L;

	public static final String MIME_APP_PDFL = "application/pdf";
	public static final String MIME_APP_ZIP = "application/zip";

	private String title;
	private String document_url;
	private String mime_type;

	private String caption;
	private String parse_mode;
	private String description;

	private String thumbnail_url;
	private Integer thumbnail_width;
	private Integer thumbnail_height;


	public InlineQueryResultDocument(String id, String documentUrl, String title, String mimeType) {
		super("document", id);
		this.document_url = documentUrl;
		this.title = title;
		this.mime_type = mimeType;
	}

	public InlineQueryResultDocument caption(String caption) {
		this.caption = caption;
		return this;
	}

	public InlineQueryResultDocument parseMode(ParseMode parseMode) {
		this.parse_mode = parseMode.name();
		return this;
	}

	public InlineQueryResultDocument description(String description) {
		this.description = description;
		return this;
	}

	public InlineQueryResultDocument thumbnailUrl(String thumbnailUrl) {
		this.thumbnail_url = thumbnailUrl;
		return this;
	}

	public InlineQueryResultDocument thumbnailWidth(Integer thumbnailWidth) {
		this.thumbnail_width = thumbnailWidth;
		return this;
	}

	public InlineQueryResultDocument thumbnailHeight(Integer thumbnailHeight) {
		this.thumbnail_height = thumbnailHeight;
		return this;
	}
}
