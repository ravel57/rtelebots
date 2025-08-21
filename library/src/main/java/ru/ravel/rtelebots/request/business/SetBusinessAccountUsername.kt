package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class SetBusinessAccountUsername private constructor(
	businessConnectionId: String,
	username: String?
) : KBaseRequest<SetBusinessAccountUsername, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(businessConnectionId: String) : this(
		businessConnectionId = businessConnectionId,
		username = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")

	var username: String? by optionalRequestParameter(username, customParameterName = "username")
	fun username(username: String) = applySelf { this.username = username }

}