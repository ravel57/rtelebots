package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

fun TelegramAware.getFile(
	fileId: String,
	modifier: ru.ravel.rtelebots.request.GetFile.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.GetFile(fileId), modifier)