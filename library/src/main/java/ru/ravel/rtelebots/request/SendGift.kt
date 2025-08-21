package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SendGift private constructor(
	userId: Long? = null,
	chatId: Long? = null,
	channelUsername: String? = null,
	giftId: String,
) : KBaseRequest<SendGift, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	companion object {

		@JvmStatic
		fun fromUserId(userId: Long, giftId: String) =
			SendGift(
				userId = userId,
				giftId = giftId
			)

		@JvmStatic
		fun fromChatId(chatId: Long, giftId: String) =
			SendGift(
				chatId = chatId,
				giftId = giftId
			)

		@JvmStatic
		fun fromChannel(channelUsername: String, giftId: String) = SendGift(
			channelUsername = channelUsername,
			giftId = giftId
		)

		/**
		 * Backwards compatability to constructor with userId
		 */
		@Deprecated("Use constructor(chatId, giftId) instead", ReplaceWith("SendGift(userId, giftId)"))
		operator fun invoke(userId: Long, giftId: String) =
			fromUserId(
				userId = userId,
				giftId = giftId
			)

	}

	constructor(chatId: Long, giftId: String) : this(
		userId = null,
		chatId = chatId,
		channelUsername = null,
		giftId = giftId
	)

	constructor(
		channelUsername: String,
		giftId: String
	) : this(
		userId = null,
		chatId = null,
		channelUsername = channelUsername,
		giftId = giftId
	)

	val userId: Long? by optionalRequestParameter(userId)
	val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
	val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")

	val giftId: String by requestParameter(giftId)

	var payForUpgrade: Boolean? by optionalRequestParameter()

	var text: String? by optionalRequestParameter()
	var textParseMode: ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter(valueMapper = { it?.name })
	var textEntities: Array<ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()

	fun text(text: String) = apply { this.text = text }

	fun textParseMode(parseMode: ru.ravel.rtelebots.model.request.ParseMode) =
		apply { this.textParseMode = parseMode }

	fun textEntities(textEntities: Array<ru.ravel.rtelebots.model.MessageEntity>) =
		apply { this.textEntities = textEntities }

}