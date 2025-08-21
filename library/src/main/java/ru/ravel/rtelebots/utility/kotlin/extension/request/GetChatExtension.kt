package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.getChat(
	chatId: Long,
	modifier: ru.ravel.rtelebots.request.GetChat.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.GetChat(chatId), modifier)

inline fun TelegramAware.getChat(
	chatId: String,
	modifier: ru.ravel.rtelebots.request.GetChat.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.GetChat(chatId), modifier)