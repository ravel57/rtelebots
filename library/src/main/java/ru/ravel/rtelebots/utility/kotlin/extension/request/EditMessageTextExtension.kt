package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

fun TelegramAware.editMessageText(
	chatId: Long,
	messageId: Int,
	text: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageText.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageText(chatId, messageId, text), modifier)

fun TelegramAware.editMessageText(
	chatId: String,
	messageId: Int,
	text: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.EditMessageText.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.EditMessageText(chatId, messageId, text), modifier)