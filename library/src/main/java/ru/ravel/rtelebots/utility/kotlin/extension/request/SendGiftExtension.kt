package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.SendGift
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.sendGift(
	chatId: Long,
	giftId: String,
	modifier: SendGift.() -> Unit = {}
) = this.execute(
	SendGift(
		chatId = chatId,
		giftId = giftId
	), modifier
)

inline fun TelegramAware.sendGift(
	channelUsername: String,
	giftId: String,
	modifier: SendGift.() -> Unit = {}
) = this.execute(
	SendGift(
		channelUsername = channelUsername,
		giftId = giftId
	), modifier
)