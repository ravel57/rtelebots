package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.editMessageReplyMarkup(
	chatId: Long,
	messageId: Int,
	modifier: ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.EditMessageReplyMarkup(chatId, messageId), modifier)

inline fun TelegramAware.editMessageReplyMarkup(
	chatId: String,
	messageId: Int,
	modifier: ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.EditMessageReplyMarkup(chatId, messageId), modifier)

inline fun TelegramAware.removeInlineKeyboard(
	chatId: Long,
	messageId: Int,
	modifier: ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.editMessageReplyMarkup(chatId, messageId) {
	replyMarkup(ru.ravel.rtelebots.model.request.InlineKeyboardMarkup())
	modifier()
}

inline fun TelegramAware.removeInlineKeyboard(
	chatId: String,
	messageId: Int,
	modifier: ru.ravel.rtelebots.request.EditMessageReplyMarkup.() -> Unit = {}
) = this.editMessageReplyMarkup(chatId, messageId) {
	replyMarkup(ru.ravel.rtelebots.model.request.InlineKeyboardMarkup())
	modifier()
}