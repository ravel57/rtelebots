package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class DeleteBusinessMessage(
	businessConnectionId: String,
	messageIds: Array<Int>
) : KBaseRequest<DeleteBusinessMessage, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val messageIds: Array<Int> by requestParameter(messageIds, customParameterName = "message_ids")

}