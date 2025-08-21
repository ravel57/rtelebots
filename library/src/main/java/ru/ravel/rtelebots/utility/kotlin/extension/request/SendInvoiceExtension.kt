package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendInvoice
import ru.ravel.rtelebots.utility.kotlin.extension.execute

fun TelegramAware.sendInvoice(
	chatId: Long,
	title: String,
	description: String,
	payload: String,
	currency: String,
	items: List<ru.ravel.rtelebots.model.request.LabeledPrice>,
	modifier: SendInvoice.() -> Unit = {}
) = this.execute(
	SendInvoice(
		chatId = chatId,
		title = title,
		description = description,
		payload = payload,
		currency = currency,
		prices = items
	), modifier
)

fun TelegramAware.sendInvoice(
	chatId: Long,
	title: String,
	description: String,
	payload: String,
	currency: String,
	vararg items: ru.ravel.rtelebots.model.request.LabeledPrice,
	modifier: SendInvoice.() -> Unit = {}
) = this.sendInvoice(
	chatId = chatId,
	title = title,
	description = description,
	payload = payload,
	currency = currency,
	items = items.toList(),
	modifier = modifier
)