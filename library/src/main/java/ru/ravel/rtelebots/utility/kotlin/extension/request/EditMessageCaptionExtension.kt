package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.editMessageCaption(
	chatId: Long,
	messageId: Int,
	caption: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageCaption.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageCaption(chatId, messageId)) {
	caption(caption)
	modifier()
}

inline fun TelegramAware.editMessageCaption(
	chatId: String,
	messageId: Int,
	caption: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageCaption.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageCaption(chatId, messageId)) {
	caption(caption)
	modifier()
}