package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendAudio
import ru.ravel.rtelebots.utility.kotlin.extension.execute
import java.io.File

inline fun TelegramAware.sendAudio(
	chatId: Long,
	audioUrl: String,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		chatId = chatId,
		audioUrl = audioUrl
	), modifier
)

inline fun TelegramAware.sendAudio(
	channelUsername: String,
	audioUrl: String,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		channelUsername = channelUsername,
		audioUrl = audioUrl
	), modifier
)


inline fun TelegramAware.sendAudio(
	chatId: Long,
	audioFile: File,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		chatId = chatId,
		audioFile = audioFile
	), modifier
)

inline fun TelegramAware.sendAudio(
	channelUsername: String,
	audioFile: File,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		channelUsername = channelUsername,
		audioFile = audioFile
	), modifier
)


inline fun TelegramAware.sendAudio(
	chatId: Long,
	audioBytes: ByteArray,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		chatId = chatId,
		audioBytes = audioBytes
	), modifier
)

inline fun TelegramAware.sendAudio(
	channelUsername: String,
	audioBytes: ByteArray,
	modifier: SendAudio.() -> Unit = {}
) = this.execute(
	SendAudio(
		channelUsername = channelUsername,
		audioBytes = audioBytes
	), modifier
)