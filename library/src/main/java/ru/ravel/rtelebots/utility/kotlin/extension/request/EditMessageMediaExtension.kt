package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.editMessageMedia(
	chatId: Long,
	messageId: Int,
	media: _root_ide_package_.ru.ravel.rtelebots.model.request.InputMedia<*>,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageMedia.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageMedia(chatId, messageId, media), modifier)

inline fun TelegramAware.editMessageMedia(
	chatId: String,
	messageId: Int,
	media: _root_ide_package_.ru.ravel.rtelebots.model.request.InputMedia<*>,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageMedia.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageMedia(chatId, messageId, media), modifier)