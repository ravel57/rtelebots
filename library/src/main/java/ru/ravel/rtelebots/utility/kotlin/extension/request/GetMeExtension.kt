package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.getMe(
	modifier: ru.ravel.rtelebots.request.GetMe.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.GetMe(), modifier)