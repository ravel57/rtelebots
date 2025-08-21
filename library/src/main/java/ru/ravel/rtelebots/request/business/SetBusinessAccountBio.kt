package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class SetBusinessAccountBio private constructor(
	businessConnectionId: String,
	bio: String?
) : KBaseRequest<SetBusinessAccountBio, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(businessConnectionId: String) : this(
		businessConnectionId = businessConnectionId,
		bio = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")

	var bio: String? by optionalRequestParameter(bio, customParameterName = "bio")
	fun bio(bio: String) = applySelf { this.bio = bio }

}