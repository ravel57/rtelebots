package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.getMe(
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.GetMe.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.GetMe(), modifier)