package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendContact
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendContact(
	chatId: Long,
	phoneNumber: String,
	firstName: String,
	lastName: String? = null,
	modifier: SendContact.() -> Unit = {}
) = this.execute(
	SendContact(
		chatId = chatId,
		phoneNumber = phoneNumber,
		firstName = firstName
	)
) {
	this.lastName = lastName
	modifier()
}

inline fun TelegramAware.sendContact(
	channelUsername: String,
	phoneNumber: String,
	firstName: String,
	lastName: String? = null,
	modifier: SendContact.() -> Unit = {}
) = this.execute(
	SendContact(
		channelUsername = channelUsername,
		phoneNumber = phoneNumber,
		firstName = firstName
	)
) {
	this.lastName = lastName
	modifier()
}