package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendPhoto
import ru.ravel.rtelebots.utility.kotlin.extension.execute
import java.io.File

inline fun TelegramAware.sendPhoto(
	chatId: Long,
	photoUrl: String,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		chatId = chatId,
		photoUrl = photoUrl
	), modifier
)

inline fun TelegramAware.sendPhoto(
	channelUsername: String,
	photoUrl: String,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		channelUsername = channelUsername,
		photoUrl = photoUrl
	), modifier
)


inline fun TelegramAware.sendPhoto(
	chatId: Long,
	photoFile: File,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		chatId = chatId,
		photoFile = photoFile
	), modifier
)

inline fun TelegramAware.sendPhoto(
	channelUsername: String,
	photoFile: File,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		channelUsername = channelUsername,
		photoFile = photoFile
	), modifier
)


inline fun TelegramAware.sendPhoto(
	chatId: Long,
	photoBytes: ByteArray,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		chatId = chatId,
		photoBytes = photoBytes
	), modifier
)

inline fun TelegramAware.sendPhoto(
	channelUsername: String,
	photoBytes: ByteArray,
	modifier: SendPhoto.() -> Unit = {}
) = this.execute(
	SendPhoto(
		channelUsername = channelUsername,
		photoBytes = photoBytes
	), modifier
)