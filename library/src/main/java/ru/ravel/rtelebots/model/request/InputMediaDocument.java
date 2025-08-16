package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.request.ContentTypes;

import java.io.File;
import java.io.Serializable;

/**
 * Stas Parshin
 * 28 July 2018
 */
public class InputMediaDocument extends InputMedia<InputMediaDocument> implements Serializable {
	private final static long serialVersionUID = 0L;

	private Boolean disable_content_type_detection;

	public InputMediaDocument(String media) {
		super("document", media);
	}

	public InputMediaDocument(File media) {
		super("document", media);
	}

	public InputMediaDocument(byte[] media) {
		super("document", media);
	}

	public InputMediaDocument disableContentTypeDetection(boolean disableContentTypeDetection) {
		disable_content_type_detection = disableContentTypeDetection;
		return this;
	}

	@Override
	public String getDefaultFileName() {
		return ContentTypes.DOC_FILE_NAME;
	}

	@Override
	public String getDefaultContentType() {
		return ContentTypes.DOC_MIME_TYPE;
	}
}
