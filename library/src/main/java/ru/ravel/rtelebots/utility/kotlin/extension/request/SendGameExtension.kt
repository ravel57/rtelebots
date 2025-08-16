package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendGame
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendGame(
	chatId: Long,
	gameShortName: String,
	modifier: SendGame.() -> Unit = {}
) = this.execute(
	SendGame(
		chatId = chatId,
		gameShortName = gameShortName
	), modifier
)

inline fun TelegramAware.sendGame(
	channelUsername: String,
	gameShortName: String,
	modifier: SendGame.() -> Unit = {}
) = this.execute(
	SendGame(
		channelUsername = channelUsername,
		gameShortName = gameShortName
	), modifier
)