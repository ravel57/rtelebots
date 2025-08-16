package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;

public class EditForumTopic extends BaseRequest<EditForumTopic, BaseResponse> {

	public EditForumTopic(Long chatId, Integer messageThreadId) {
		this(chatId.toString(), messageThreadId);
	}

	public EditForumTopic(String chatId, Integer messageThreadId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
	}

	public EditForumTopic(Long chatId, Integer messageThreadId, String name, String iconCustomEmojiId) {
		this(chatId.toString(), messageThreadId, name, iconCustomEmojiId);
	}

	public EditForumTopic(String chatId, Integer messageThreadId, String name, String iconCustomEmojiId) {
		super(BaseResponse.class);
		add("chat_id", chatId);
		add("message_thread_id", messageThreadId);
		add("name", name);
		add("icon_custom_emoji_id", iconCustomEmojiId);
	}


	public EditForumTopic name(String name) {
		add("name", name);
		return this;
	}

	public EditForumTopic iconCustomEmojiId(String icon_custom_emoji_id) {
		add("icon_custom_emoji_id", icon_custom_emoji_id);
		return this;
	}

}
