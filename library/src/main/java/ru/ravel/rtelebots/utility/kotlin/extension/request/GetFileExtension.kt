package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

fun TelegramAware.getFile(
	fileId: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.GetFile.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.GetFile(fileId), modifier)