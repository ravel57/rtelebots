package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.editMessageReplyMarkup(
	chatId: Long,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup(chatId, messageId), modifier)

inline fun TelegramAware.editMessageReplyMarkup(
	chatId: String,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup(chatId, messageId), modifier)

inline fun TelegramAware.removeInlineKeyboard(
	chatId: Long,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.editMessageReplyMarkup(chatId, messageId) {
	replyMarkup(_root_ide_package_.ru.ravel.rtelebots.model.request.InlineKeyboardMarkup())
	modifier()
}

inline fun TelegramAware.removeInlineKeyboard(
	chatId: String,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.editMessageReplyMarkup(chatId, messageId) {
	replyMarkup(_root_ide_package_.ru.ravel.rtelebots.model.request.InlineKeyboardMarkup())
	modifier()
}