package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendVideoNote
import ru.ravel.rtelebots.utility.kotlin.extension.execute
import java.io.File

inline fun TelegramAware.sendVideoNote(
	chatId: Long,
	videoNoteUrl: String,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		chatId = chatId,
		videoNoteUrl = videoNoteUrl
	), modifier
)

inline fun TelegramAware.sendVideoNote(
	channelUsername: String,
	videoNoteUrl: String,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		channelUsername = channelUsername,
		videoNoteUrl = videoNoteUrl
	), modifier
)


inline fun TelegramAware.sendVideoNote(
	chatId: Long,
	videoNoteFile: File,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		chatId = chatId,
		videoNoteFile = videoNoteFile
	), modifier
)

inline fun TelegramAware.sendVideoNote(
	channelUsername: String,
	videoNoteFile: File,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		channelUsername = channelUsername,
		videoNoteFile = videoNoteFile
	), modifier
)


inline fun TelegramAware.sendVideoNote(
	chatId: Long,
	videoNoteBytes: ByteArray,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		chatId = chatId,
		videoNoteBytes = videoNoteBytes
	), modifier
)

inline fun TelegramAware.sendVideoNote(
	channelUsername: String,
	videoNoteBytes: ByteArray,
	modifier: SendVideoNote.() -> Unit = {}
) = this.execute(
	SendVideoNote(
		channelUsername = channelUsername,
		videoNoteBytes = videoNoteBytes
	), modifier
)