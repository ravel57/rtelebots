package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.Sticker;

import java.util.List;

public class GetForumTopicIconStickersResponse extends BaseResponse {
	private List<Sticker> result;

	GetForumTopicIconStickersResponse() {

	}

	public List<Sticker> stickers() {
		return result;
	}

	@Override
	public String toString() {
		return "GetForumTopicIconStickersResponse{" +
				"result=" + result +
				'}';
	}
}
