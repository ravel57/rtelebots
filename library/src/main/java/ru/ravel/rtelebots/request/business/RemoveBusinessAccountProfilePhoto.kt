package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class RemoveBusinessAccountProfilePhoto private constructor(
	businessConnectionId: String,
	isPublic: Boolean?
) : KBaseRequest<RemoveBusinessAccountProfilePhoto, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(
	_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class
) {

	constructor(businessConnectionId: String) : this(
		businessConnectionId = businessConnectionId,
		isPublic = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")

	var isPublic: Boolean? by optionalRequestParameter(isPublic, customParameterName = "is_public")
	fun isPublic(isPublic: Boolean) = applySelf { this.isPublic = isPublic }

}