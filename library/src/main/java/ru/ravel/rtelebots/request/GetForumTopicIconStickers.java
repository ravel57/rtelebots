package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetForumTopicIconStickersResponse;

public class GetForumTopicIconStickers extends BaseRequest<GetForumTopicIconStickers, GetForumTopicIconStickersResponse> {
	public GetForumTopicIconStickers() {
		super(GetForumTopicIconStickersResponse.class);
	}
}
