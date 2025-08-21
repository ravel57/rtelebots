package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class ConvertGiftToStars(
	businessConnectionId: String,
	ownedGiftId: String
) : KBaseRequest<ConvertGiftToStars, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val ownedGiftId: String by requestParameter(ownedGiftId, customParameterName = "owned_gift_id")

}