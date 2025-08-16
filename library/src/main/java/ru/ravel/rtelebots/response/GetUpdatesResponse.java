package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.Update;

import java.util.List;

/**
 * stas
 * 8/11/15.
 */
public class GetUpdatesResponse extends BaseResponse {

	private List<Update> result;

	GetUpdatesResponse() {
	}

	public List<Update> updates() {
		return result;
	}

	@Override
	public String toString() {
		return String.format("GetUpdatesResponse{result=%s}", result);
	}
}