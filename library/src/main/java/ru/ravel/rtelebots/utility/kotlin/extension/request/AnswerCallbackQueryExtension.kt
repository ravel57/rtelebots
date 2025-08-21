package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.answerCallbackQuery(
	callbackQueryId: String,
	modifier: ru.ravel.rtelebots.request.AnswerCallbackQuery.() -> Unit = {}
) = this.execute(ru.ravel.rtelebots.request.AnswerCallbackQuery(callbackQueryId), modifier)