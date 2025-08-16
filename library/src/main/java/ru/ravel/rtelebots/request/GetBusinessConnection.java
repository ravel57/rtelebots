package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetBusinessConnectionResponse;

public class GetBusinessConnection extends BaseRequest<GetBusinessConnection, GetBusinessConnectionResponse> {

	public GetBusinessConnection(String businessConnectionId) {
		super(GetBusinessConnectionResponse.class);
		add("business_connection_id", businessConnectionId);
	}
}
