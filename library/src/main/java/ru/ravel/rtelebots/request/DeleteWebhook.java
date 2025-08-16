package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Stas Parshin
 * 07 December 2016
 */
public class DeleteWebhook extends BaseRequest<DeleteWebhook, BaseResponse> {

	public DeleteWebhook() {
		super(BaseResponse.class);
	}

	public DeleteWebhook dropPendingUpdates(boolean dropPendingUpdates) {
		return add("drop_pending_updates", dropPendingUpdates);
	}
}
