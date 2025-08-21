package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendMediaGroup(
	chatId: Long,
	media: List<ru.ravel.rtelebots.model.request.InputMedia<*>>,
	modifier: ru.ravel.rtelebots.request.SendMediaGroup.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.SendMediaGroup(chatId, *media.toTypedArray()), modifier)

inline fun TelegramAware.sendMediaGroup(
	chatId: String,
	media: List<ru.ravel.rtelebots.model.request.InputMedia<*>>,
	modifier: ru.ravel.rtelebots.request.SendMediaGroup.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.SendMediaGroup(chatId, *media.toTypedArray()), modifier)