package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class TransferGift private constructor(
	businessConnectionId: String,
	ownedGiftId: String,
	newOwnerChatId: Long,
	starCount: Int?
) : KBaseRequest<TransferGift, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(businessConnectionId: String, ownedGiftId: String, newOwnerChatId: Long) : this(
		businessConnectionId = businessConnectionId,
		ownedGiftId = ownedGiftId,
		newOwnerChatId = newOwnerChatId,
		starCount = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val ownedGiftId: String by requestParameter(ownedGiftId, customParameterName = "owned_gift_id")
	val newOwnerChatId: Long by requestParameter(newOwnerChatId, customParameterName = "new_owner_chat_id")

	var starCount: Int? by optionalRequestParameter(starCount, customParameterName = "star_count")
	fun starCount(starCount: Int) = applySelf { this.starCount = starCount }

}