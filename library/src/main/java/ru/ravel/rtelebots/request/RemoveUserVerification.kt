package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.requestParameter

class RemoveUserVerification(
	userId: Long
) : KBaseRequest<RemoveUserVerification, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	val userId: Long by requestParameter(userId)

}