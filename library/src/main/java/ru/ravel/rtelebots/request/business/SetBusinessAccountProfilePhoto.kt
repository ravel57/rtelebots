package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.model.inputprofilephoto.InputProfilePhoto
import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class SetBusinessAccountProfilePhoto private constructor(
	businessConnectionId: String,
	photo: InputProfilePhoto,
	isPublic: Boolean?
) : KBaseRequest<SetBusinessAccountProfilePhoto, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(businessConnectionId: String, photo: InputProfilePhoto) : this(
		businessConnectionId = businessConnectionId,
		photo = photo,
		isPublic = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val photo: InputProfilePhoto by requestParameter(photo, customParameterName = "photo")

	var isPublic: Boolean? by optionalRequestParameter(isPublic, customParameterName = "is_public")
	fun isPublic(isPublic: Boolean) = applySelf { this.isPublic = isPublic }

}