package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.answerPreCheckoutQuery(
	preCheckoutId: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.AnswerPreCheckoutQuery.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.AnswerPreCheckoutQuery(preCheckoutId), modifier)

inline fun TelegramAware.answerPreCheckoutQuery(
	preCheckoutId: String,
	errorMessage: String,
	modifier: _root_ide_package_.ru.ravel.rtelebots.request.AnswerPreCheckoutQuery.() -> Unit = {}
) = this.execute(_root_ide_package_.ru.ravel.rtelebots.request.AnswerPreCheckoutQuery(preCheckoutId, errorMessage), modifier)