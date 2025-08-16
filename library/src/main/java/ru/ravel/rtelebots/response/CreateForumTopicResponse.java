package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.ForumTopic;

public class CreateForumTopicResponse extends BaseResponse {
	private ForumTopic result;

	public ForumTopic forumTopic() {
		return result;
	}

	CreateForumTopicResponse() {
	}

	@Override
	public String toString() {
		return "CreateForumTopicResponse{" +
				"result=" + result +
				'}';
	}
}
