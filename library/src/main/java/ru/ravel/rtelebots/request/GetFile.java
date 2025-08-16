package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetFileResponse;

/**
 * stas
 * 5/1/16.
 */
public class GetFile extends BaseRequest<GetFile, GetFileResponse> {

	public GetFile(String fileId) {
		super(GetFileResponse.class);
		add("file_id", fileId);
	}
}
