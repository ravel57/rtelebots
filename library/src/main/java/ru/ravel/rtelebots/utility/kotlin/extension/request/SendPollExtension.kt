package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendPoll
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendPoll(
	chatId: Long,
	question: String,
	options: List<ru.ravel.rtelebots.model.request.InputPollOption>,
	modifier: SendPoll.() -> Unit = {}
) = this.execute(
	SendPoll(
		chatId = chatId,
		question = question,
		options = options
	), modifier
)

inline fun TelegramAware.sendPoll(
	chatId: Long,
	question: String,
	vararg options: ru.ravel.rtelebots.model.request.InputPollOption,
	modifier: SendPoll.() -> Unit = {}
) = this.sendPoll(
	chatId = chatId,
	question = question,
	options = options.toList(),
	modifier = modifier
)


inline fun TelegramAware.sendPoll(
	channelUsername: String,
	question: String,
	options: List<ru.ravel.rtelebots.model.request.InputPollOption>,
	modifier: SendPoll.() -> Unit = {}
) = this.execute(
	SendPoll(
		channelUsername = channelUsername,
		question = question,
		options = options
	), modifier
)

inline fun TelegramAware.sendPoll(
	channelUsername: String,
	question: String,
	vararg options: ru.ravel.rtelebots.model.request.InputPollOption,
	modifier: SendPoll.() -> Unit = {}
) = this.sendPoll(
	channelUsername = channelUsername,
	question = question,
	options = options.toList(),
	modifier = modifier
)

