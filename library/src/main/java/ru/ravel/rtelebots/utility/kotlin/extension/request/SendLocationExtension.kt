package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendLocation
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendLocation(
	chatId: Long,
	latitude: Float,
	longitude: Float,
	modifier: SendLocation.() -> Unit = {}
) = this.execute(
	SendLocation(
		chatId = chatId,
		latitude = latitude,
		longitude = longitude,
	), modifier
)

inline fun TelegramAware.sendLocation(
	channelUsername: String,
	latitude: Float,
	longitude: Float,
	modifier: SendLocation.() -> Unit = {}
) = this.execute(
	SendLocation(
		channelUsername = channelUsername,
		latitude = latitude,
		longitude = longitude,
	), modifier
)