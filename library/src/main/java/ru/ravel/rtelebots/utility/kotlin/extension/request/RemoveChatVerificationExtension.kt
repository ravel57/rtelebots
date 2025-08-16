package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.RemoveChatVerification
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.removeChatVerification(
	chatId: Long,
	modifier: RemoveChatVerification.() -> Unit = {}
) = this.execute(
	RemoveChatVerification(
		chatId = chatId
	), modifier
)

inline fun TelegramAware.removeChatVerification(
	channelUsername: String,
	modifier: RemoveChatVerification.() -> Unit = {}
) = this.execute(
	RemoveChatVerification(
		channelUsername = channelUsername
	), modifier
)