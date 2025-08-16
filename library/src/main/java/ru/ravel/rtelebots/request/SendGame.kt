package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SendGame private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	gameShortName: String
) : AbstractSendRequest<SendGame>(
	chatId = chatId,
	channelUsername = channelUsername,
) {

	constructor(chatId: Long, gameShortName: String) : this(
		chatId = chatId,
		channelUsername = null,
		gameShortName = gameShortName
	)

	constructor(channelUsername: String, gameShortName: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		gameShortName = gameShortName
	)

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendGame(chatId, gameShortName)"))
	constructor(chatId: Any, gameShortName: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		gameShortName = gameShortName
	) {
		checkDeprecatedConstructorParameters()
	}

	val gameShortName: String by requestParameter(gameShortName)

}