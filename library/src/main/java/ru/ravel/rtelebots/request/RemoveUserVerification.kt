package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.requestParameter

class RemoveUserVerification(
	userId: Long
) : KBaseRequest<RemoveUserVerification, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val userId: Long by requestParameter(userId)

}