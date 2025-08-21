package ru.ravel.rtelebots.model.request;

import java.io.Serializable;

/**
 * Stas Parshin
 * 06 May 2016
 */
public class InlineQueryResultContact extends InlineQueryResult<InlineQueryResultContact> implements Serializable {
	private final static long serialVersionUID = 0L;

	private final String phone_number;
	private final String first_name;

	private String last_name;
	private String vcard;

	private String thumbnail_url;
	private Integer thumbnail_width;
	private Integer thumbnail_height;

	public InlineQueryResultContact(String id, String phoneNumber, String firstName) {
		super("contact", id);
		this.phone_number = phoneNumber;
		this.first_name = firstName;
	}

	public InlineQueryResultContact lastName(String lastName) {
		this.last_name = lastName;
		return this;
	}

	public InlineQueryResultContact vcard(String vcard) {
		this.vcard = vcard;
		return this;
	}

	public InlineQueryResultContact thumbnailUrl(String thumbnailUrl) {
		this.thumbnail_url = thumbnailUrl;
		return this;
	}

	public InlineQueryResultContact thumbnailWidth(Integer thumbnailWidth) {
		this.thumbnail_width = thumbnailWidth;
		return this;
	}

	public InlineQueryResultContact thumbnailHeight(Integer thumbnailHeight) {
		this.thumbnail_height = thumbnailHeight;
		return this;
	}
}
