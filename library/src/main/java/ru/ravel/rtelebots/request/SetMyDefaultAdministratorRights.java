package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.ChatAdministratorRights;
import ru.ravel.rtelebots.response.BaseResponse;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class SetMyDefaultAdministratorRights extends BaseRequest<SetMyDefaultAdministratorRights, BaseResponse> {

	public SetMyDefaultAdministratorRights() {
		super(BaseResponse.class);
	}

	public SetMyDefaultAdministratorRights rights(ChatAdministratorRights chatAdministratorRights) {
		return add("rights", chatAdministratorRights);
	}

	public SetMyDefaultAdministratorRights forChannels(boolean forChannels) {
		return add("for_channels", forChannels);
	}

}
