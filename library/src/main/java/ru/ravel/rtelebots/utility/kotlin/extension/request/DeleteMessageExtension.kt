package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.deleteMessage(
	chatId: Long,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.DeleteMessage.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.DeleteMessage(chatId, messageId), modifier)

inline fun TelegramAware.deleteMessage(
	chatId: String,
	messageId: Int,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.DeleteMessage.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.DeleteMessage(chatId, messageId), modifier)