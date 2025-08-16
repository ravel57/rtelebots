package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendMediaGroup(
	chatId: Long,
	media: List<_root_ide_package_.ru.ravel.rtelebots.model.request.InputMedia<*>>,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.SendMediaGroup.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.SendMediaGroup(chatId, *media.toTypedArray()), modifier)

inline fun TelegramAware.sendMediaGroup(
	chatId: String,
	media: List<_root_ide_package_.ru.ravel.rtelebots.model.request.InputMedia<*>>,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.SendMediaGroup.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.SendMediaGroup(chatId, *media.toTypedArray()), modifier)