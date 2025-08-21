package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.editMessageMedia(
	chatId: Long,
	messageId: Int,
	media: ru.ravel.rtelebots.model.request.InputMedia<*>,
	modifier: ru.ravel.rtelebots.request.EditMessageMedia.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.EditMessageMedia(chatId, messageId, media), modifier)

inline fun TelegramAware.editMessageMedia(
	chatId: String,
	messageId: Int,
	media: ru.ravel.rtelebots.model.request.InputMedia<*>,
	modifier: ru.ravel.rtelebots.request.EditMessageMedia.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.EditMessageMedia(chatId, messageId, media), modifier)