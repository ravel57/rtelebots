package ru.ravel.rtelebots;

import ru.ravel.rtelebots.request.BaseRequest;
import ru.ravel.rtelebots.response.BaseResponse;

import java.io.IOException;

/**
 * stas
 * 5/3/16.
 */
public interface Callback<T extends BaseRequest<T, R>, R extends BaseResponse> {

	void onResponse(T request, R response);

	void onFailure(T request, IOException e);
}
