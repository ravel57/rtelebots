package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.VerifyChat
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.verifyChat(
	chatId: Long,
	customDescription: String? = null,
	modifier: VerifyChat.() -> Unit = {}
) = this.execute(
	VerifyChat(
		chatId = chatId
	)
) {
	this.customDescription = customDescription
	modifier()
}

inline fun TelegramAware.verifyChat(
	channelUsername: String,
	customDescription: String? = null,
	modifier: VerifyChat.() -> Unit = {}
) = this.execute(
	VerifyChat(
		channelUsername = channelUsername
	)
) {
	this.customDescription = customDescription
	modifier()
}