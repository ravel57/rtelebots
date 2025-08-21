package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.answerPreCheckoutQuery(
	preCheckoutId: String,
	modifier: ru.ravel.rtelebots.request.AnswerPreCheckoutQuery.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.AnswerPreCheckoutQuery(preCheckoutId), modifier)

inline fun TelegramAware.answerPreCheckoutQuery(
	preCheckoutId: String,
	errorMessage: String,
	modifier: ru.ravel.rtelebots.request.AnswerPreCheckoutQuery.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.AnswerPreCheckoutQuery(preCheckoutId, errorMessage), modifier)