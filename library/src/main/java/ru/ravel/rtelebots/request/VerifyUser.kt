package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class VerifyUser(
	userId: Long
) : KBaseRequest<VerifyUser, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val userId: Long by requestParameter(userId)
	var customDescription: String? by optionalRequestParameter()

	fun customDescription(customDescription: String) = applySelf { this.customDescription = customDescription }

}