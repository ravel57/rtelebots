package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class SetBusinessAccountName private constructor(
	businessConnectionId: String,
	firstName: String,
	lastName: String?
) : KBaseRequest<SetBusinessAccountName, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(businessConnectionId: String, firstName: String) : this(
		businessConnectionId = businessConnectionId,
		firstName = firstName,
		lastName = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val firstName: String by requestParameter(firstName, customParameterName = "first_name")

	var lastName: String? by optionalRequestParameter(lastName, customParameterName = "last_name")
	fun lastName(lastName: String) = applySelf { this.lastName = lastName }

}