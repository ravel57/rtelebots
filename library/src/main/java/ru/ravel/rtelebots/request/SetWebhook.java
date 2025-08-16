package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

import java.io.File;

/**
 * stas
 * 5/2/16.
 */
public class SetWebhook extends BaseRequest<SetWebhook, BaseResponse> {

	private boolean isMultipart = false;

	public SetWebhook() {
		super(BaseResponse.class);
	}

	public SetWebhook url(String url) {
		return add("url", url);
	}

	public SetWebhook certificate(byte[] certificate) {
		isMultipart = true;
		return add("certificate", certificate);
	}

	public SetWebhook certificate(File certificate) {
		isMultipart = true;
		return add("certificate", certificate);
	}

	public SetWebhook ipAddress(String ipAddress) {
		return add("ip_address", ipAddress);
	}

	public SetWebhook maxConnections(int maxConnections) {
		return add("max_connections", maxConnections);
	}

	public SetWebhook allowedUpdates(String... allowedUpdates) {
		return add("allowed_updates", allowedUpdates);
	}

	public SetWebhook dropPendingUpdates(boolean dropPendingUpdates) {
		return add("drop_pending_updates", dropPendingUpdates);
	}

	public SetWebhook secretToken(String secretToken) {
		return add("secret_token", secretToken);
	}


	@Override
	public boolean isMultipart() {
		return isMultipart;
	}
}
