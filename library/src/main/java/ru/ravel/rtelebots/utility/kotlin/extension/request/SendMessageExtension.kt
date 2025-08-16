package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendMessage
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendMessage(
	chatId: Long,
	text: String,
	modifier: SendMessage.() -> Unit = {}
) = this.execute(
	SendMessage(
		chatId = chatId,
		text = text
	), modifier
)

inline fun TelegramAware.sendMessage(
	channelUsername: String,
	text: String,
	modifier: SendMessage.() -> Unit = {}
) = this.execute(
	SendMessage(
		channelUsername = channelUsername,
		text = text
	), modifier
)