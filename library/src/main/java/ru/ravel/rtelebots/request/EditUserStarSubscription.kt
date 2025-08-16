package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.requestParameter

class EditUserStarSubscription(
	userId: Long,
	telegramPaymentChargeId: String,
	isCanceled: Boolean
) : KBaseRequest<EditUserStarSubscription, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val userId: Long by requestParameter(userId)
	val telegramPaymentChargeId: String by requestParameter(telegramPaymentChargeId)
	val isCanceled: Boolean by requestParameter(isCanceled)

}