package ru.ravel.rtelebots.impl;

import com.google.gson.Gson;
import okhttp3.*;
import ru.ravel.rtelebots.Callback;
import ru.ravel.rtelebots.Cancellable;
import ru.ravel.rtelebots.model.request.InputFile;
import ru.ravel.rtelebots.request.BaseRequest;
import ru.ravel.rtelebots.response.BaseResponse;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * stas
 * 5/1/16.
 */
public class TelegramBotClient {

	private final OkHttpClient client;
	private OkHttpClient clientWithTimeout;
	private final Gson gson;
	private final String baseUrl;

	public TelegramBotClient(OkHttpClient client, Gson gson, String baseUrl) {
		this.client = client;
		this.gson = gson;
		this.baseUrl = baseUrl;
		this.clientWithTimeout = client;
	}

	public <T extends BaseRequest<T, R>, R extends BaseResponse> Cancellable send(final T request, final Callback<T, R> callback) {
		OkHttpClient client = getOkHttpClient(request);

		Call call = client.newCall(createRequest(request));
		call.enqueue(new okhttp3.Callback() {
			@Override
			public void onResponse(Call call, Response response) {
				R result = null;
				Exception exception = null;
				try {
					result = gson.fromJson(response.body().string(), request.getResponseType());
				} catch (Exception e) {
					exception = e;
				}
				if (result != null) {
					callback.onResponse(request, result);
				} else if (exception != null) {
					IOException ioEx = exception instanceof IOException ? (IOException) exception : new IOException(exception);
					callback.onFailure(request, ioEx);
				} else {
					callback.onFailure(request, new IOException("Empty response"));
				}
			}

			@Override
			public void onFailure(Call call, IOException e) {
				callback.onFailure(request, e);
			}
		});

		return call::cancel;
	}

	public <T extends BaseRequest<T, R>, R extends BaseResponse> R send(final BaseRequest<T, R> request) {
		try {
			OkHttpClient client = getOkHttpClient(request);
			Response response = client.newCall(createRequest(request)).execute();
			return gson.fromJson(response.body().string(), request.getResponseType());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void shutdown() {
		client.dispatcher().executorService().shutdown();
	}

	private OkHttpClient getOkHttpClient(BaseRequest<?, ?> request) {
		int timeoutMillis = request.getTimeoutSeconds() * 1000;

		if (client.readTimeoutMillis() == 0 || client.readTimeoutMillis() > timeoutMillis) return client;
		if (clientWithTimeout.readTimeoutMillis() > timeoutMillis) return clientWithTimeout;

		clientWithTimeout = client.newBuilder().readTimeout(timeoutMillis + 1000, TimeUnit.MILLISECONDS).build();
		return clientWithTimeout;
	}

	private Request createRequest(BaseRequest<?, ?> request) {
		return new Request.Builder()
				.url(baseUrl + request.getMethod())
				.post(createRequestBody(request))
				.build();
	}

	private RequestBody createRequestBody(BaseRequest<?, ?> request) {
		if (request.isMultipart()) {
			MediaType contentType = MediaType.parse(request.getContentType());

			MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);

			for (Map.Entry<String, Object> parameter : request.getParameters().entrySet()) {
				String name = parameter.getKey();
				Object value = parameter.getValue();
				if (value instanceof byte[]) {
					builder.addFormDataPart(name, request.getFileName(), RequestBody.create((byte[]) value, contentType));
				} else if (value instanceof File) {
					builder.addFormDataPart(name, request.getFileName(), RequestBody.create((File) value, contentType));
				} else if (value instanceof InputFile) {
					InputFile inputFile = (InputFile) value;
					contentType = MediaType.parse(inputFile.getContentType());
					RequestBody body;
					if (inputFile.getFile() != null) {
						body = RequestBody.create(inputFile.getFile(), contentType);
					} else {
						body = RequestBody.create(inputFile.getBytes(), contentType);
					}
					builder.addFormDataPart(name, ((InputFile) value).getFileName(), body);
				} else {
					builder.addFormDataPart(name, toParamValue(value));
				}
			}

			return builder.build();
		} else {
			FormBody.Builder builder = new FormBody.Builder();
			for (Map.Entry<String, Object> parameter : request.getParameters().entrySet()) {
				builder.add(parameter.getKey(), toParamValue(parameter.getValue()));
			}
			return builder.build();
		}
	}

	private String toParamValue(Object obj) {
		if (obj.getClass().isPrimitive() ||
				obj.getClass().isEnum() ||
				obj.getClass().getName().startsWith("java.lang")) {
			return String.valueOf(obj);
		}
		return gson.toJson(obj);
	}
}
