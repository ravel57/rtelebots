package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.getChat(
	chatId: Long,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.GetChat.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.GetChat(chatId), modifier)

inline fun TelegramAware.getChat(
	chatId: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.GetChat.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.GetChat(chatId), modifier)