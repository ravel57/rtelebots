package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.request.ContentTypes;

import java.io.File;
import java.io.Serializable;

/**
 * Stas Parshin
 * 28 July 2018
 */
public class InputMediaAnimation extends InputMedia<InputMediaAnimation> implements Serializable {
	private final static long serialVersionUID = 0L;

	private Integer width, height, duration;
	private Boolean has_spoiler;

	public InputMediaAnimation(String media) {
		super("animation", media);
	}

	public InputMediaAnimation(File media) {
		super("animation", media);
	}

	public InputMediaAnimation(byte[] media) {
		super("animation", media);
	}

	public InputMediaAnimation width(Integer width) {
		this.width = width;
		return this;
	}

	public InputMediaAnimation height(Integer height) {
		this.height = height;
		return this;
	}

	public InputMediaAnimation duration(Integer duration) {
		this.duration = duration;
		return this;
	}

	public InputMediaAnimation hasSpoiler(boolean has_spoiler) {
		this.has_spoiler = has_spoiler;
		return this;
	}

	@Override
	public String getDefaultFileName() {
		return ContentTypes.GIF_FILE_NAME;
	}

	@Override
	public String getDefaultContentType() {
		return ContentTypes.GIF_MIME_TYPE;
	}
}
