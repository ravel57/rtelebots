package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetWebhookInfoResponse;
import ru.ravel.rtelebots.response.GetWebhookInfoResponse;

/**
 * Stas Parshin
 * 03 October 2016
 */
public class GetWebhookInfo extends BaseRequest<GetWebhookInfo, GetWebhookInfoResponse> {

	public GetWebhookInfo() {
		super(GetWebhookInfoResponse.class);
	}

}
