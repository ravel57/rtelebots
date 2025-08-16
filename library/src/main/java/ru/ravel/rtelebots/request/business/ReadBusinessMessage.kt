package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class ReadBusinessMessage(
	businessConnectionId: String,
	chatId: Long,
	messageId: Int
) : KBaseRequest<ReadBusinessMessage, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val chatId: Long by requestParameter(chatId, customParameterName = "chat_id")
	val messageId: Int by requestParameter(messageId, customParameterName = "message_id")

}