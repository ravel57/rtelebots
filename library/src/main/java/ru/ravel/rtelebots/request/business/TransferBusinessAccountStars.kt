package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class TransferBusinessAccountStars(
	businessConnectionId: String,
	starCount: Int
) : KBaseRequest<TransferBusinessAccountStars, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val starCount: Int by requestParameter(starCount, customParameterName = "star_count")

}