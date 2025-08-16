package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.ForwardMessage
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.forwardMessage(
	chatId: Long,
	fromChatId: Long,
	messageId: Int,
	modifier: ForwardMessage.() -> Unit = {}
) = this.execute(
	ForwardMessage(
		chatId = chatId,
		fromChatId = fromChatId,
		messageId = messageId
	), modifier
)

inline fun TelegramAware.forwardMessage(
	channelUsername: String,
	fromChatId: Long,
	messageId: Int,
	modifier: ForwardMessage.() -> Unit = {}
) = this.execute(
	ForwardMessage(
		channelUsername = channelUsername,
		fromChatId = fromChatId,
		messageId = messageId
	), modifier
)

inline fun TelegramAware.forwardMessage(
	chatId: Long,
	fromChannelUsername: String,
	messageId: Int,
	modifier: ForwardMessage.() -> Unit = {}
) = this.execute(
	ForwardMessage(
		chatId = chatId,
		fromChannelUsername = fromChannelUsername,
		messageId = messageId
	), modifier
)

inline fun TelegramAware.forwardMessage(
	channelUsername: String,
	fromChannelUsername: String,
	messageId: Int,
	modifier: ForwardMessage.() -> Unit = {}
) = this.execute(
	ForwardMessage(
		channelUsername = channelUsername,
		fromChannelUsername = fromChannelUsername,
		messageId = messageId
	), modifier
)