package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter

class RemoveChatVerification(
	chatId: Long?,
	channelUsername: String?
) : KBaseRequest<RemoveChatVerification, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(chatId: Long) : this(
		chatId = chatId,
		channelUsername = null
	)

	constructor(channelUsername: String) : this(
		chatId = null,
		channelUsername = channelUsername
	)

	val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
	val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")

}