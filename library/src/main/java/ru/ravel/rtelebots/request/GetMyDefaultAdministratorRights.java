package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.GetMyDefaultAdministratorRightsResponse;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class GetMyDefaultAdministratorRights extends BaseRequest<GetMyDefaultAdministratorRights, GetMyDefaultAdministratorRightsResponse> {

	public GetMyDefaultAdministratorRights() {
		super(GetMyDefaultAdministratorRightsResponse.class);
	}

	public GetMyDefaultAdministratorRights forChannels(boolean forChannels) {
		return add("for_channels", forChannels);
	}

}
