package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendVenue
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendVenue(
	chatId: Long,
	latitude: Float,
	longitude: Float,
	title: String,
	address: String,
	modifier: SendVenue.() -> Unit = {}
) = this.execute(
	SendVenue(
		chatId = chatId,
		latitude = latitude,
		longitude = longitude,
		title = title,
		address = address,
	), modifier
)

inline fun TelegramAware.sendVenue(
	channelUsername: String,
	latitude: Float,
	longitude: Float,
	title: String,
	address: String,
	modifier: SendVenue.() -> Unit = {}
) = this.execute(
	SendVenue(
		channelUsername = channelUsername,
		latitude = latitude,
		longitude = longitude,
		title = title,
		address = address,
	), modifier
)