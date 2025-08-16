package ru.ravel.rtelebots.model.request;

import java.io.Serializable;

/**
 * stas
 * 1/12/16.
 */
public class InlineQueryResultVideo extends InlineQueryResult<InlineQueryResultVideo> implements Serializable {
	private final static long serialVersionUID = 0L;

	public static final String MIME_TEXT_HTML = "text/html";
	public static final String MIME_VIDEO_MP4 = "video/mp4";

	private String video_url;
	private String mime_type;
	private String thumbnail_url;
	private String title;

	private String caption;
	private String parse_mode;
	private Integer video_width;
	private Integer video_height;
	private Integer video_duration;
	private String description;

	/**
	 * @deprecated use a constructor without messageText and inputMessageContent(new InputTextMessageContent(messageText)) instead
	 */
	@Deprecated
	public InlineQueryResultVideo(String id, String videoUrl, String mimeType, String messageText, String thumbUrl, String title) {
		this(id, videoUrl, mimeType, new InputTextMessageContent(messageText), thumbUrl, title);
	}

	/**
	 * @deprecated use a constructor without inputMessageContent and inputMessageContent(inputMessageContent) instead
	 */
	@Deprecated
	public InlineQueryResultVideo(String id, String videoUrl, String mimeType, InputMessageContent inputMessageContent, String thumbnailUrl, String title) {
		this(id, videoUrl, mimeType, thumbnailUrl, title);
		inputMessageContent(inputMessageContent);
	}

	public InlineQueryResultVideo(String id, String videoUrl, String mimeType, String thumbnailUrl, String title) {
		super("video", id);
		this.video_url = videoUrl;
		this.mime_type = mimeType;
		this.thumbnail_url = thumbnailUrl;
		this.title = title;
	}

	public InlineQueryResultVideo caption(String caption) {
		this.caption = caption;
		return this;
	}

	public InlineQueryResultVideo parseMode(ParseMode parseMode) {
		this.parse_mode = parseMode.name();
		return this;
	}

	public InlineQueryResultVideo videoWidth(Integer videoWidth) {
		this.video_width = videoWidth;
		return this;
	}

	public InlineQueryResultVideo videoHeight(Integer videoHeight) {
		this.video_height = videoHeight;
		return this;
	}

	public InlineQueryResultVideo videoDuration(Integer videoDuration) {
		this.video_duration = videoDuration;
		return this;
	}

	public InlineQueryResultVideo description(String description) {
		this.description = description;
		return this;
	}
}
