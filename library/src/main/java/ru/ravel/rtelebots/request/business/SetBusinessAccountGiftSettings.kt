package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.model.gift.AcceptedGiftTypes
import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class SetBusinessAccountGiftSettings(
	businessConnectionId: String,
	showGiftButton: Boolean,
	acceptedGiftTypes: AcceptedGiftTypes
) : KBaseRequest<SetBusinessAccountGiftSettings, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val showGiftButton: Boolean by requestParameter(showGiftButton, customParameterName = "show_gift_button")
	val acceptedGiftTypes: AcceptedGiftTypes by requestParameter(acceptedGiftTypes, customParameterName = "accepted_gift_types")

}