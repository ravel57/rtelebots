package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.JavaInteger
import ru.ravel.rtelebots.utility.kotlin.JavaLong
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class CopyMessage private constructor(
	chatId: Long?,
	channelUsername: String?,

	fromChatId: Long?,
	fromChannelUsername: String?,

	messageId: Int
) : KBaseRequest<CopyMessage, _root_ide_package_.ru.ravel.rtelebots.response.MessageIdResponse>(_root_ide_package_.ru.ravel.rtelebots.response.MessageIdResponse::class) {

	constructor(chatId: Long, fromChatId: Long, messageId: Int) : this(
		chatId = chatId,
		channelUsername = null,

		fromChatId = fromChatId,
		fromChannelUsername = null,

		messageId = messageId
	)

	/**
	 * Backwards-compatability for Java code
	 */
	constructor(chatId: JavaLong, fromChatId: JavaLong, messageId: JavaInteger) : this(
		chatId = chatId.toLong(),
		fromChatId = fromChatId.toLong(),
		messageId = messageId.toInt()
	)


	constructor(channelUsername: String, fromChatId: Long, messageId: Int) : this(
		chatId = null,
		channelUsername = channelUsername,

		fromChatId = fromChatId,
		fromChannelUsername = null,

		messageId = messageId
	)

	/**
	 * Backwards-compatability for Java code
	 */
	constructor(channelUsername: String, fromChatId: JavaLong, messageId: JavaInteger) : this(
		channelUsername = channelUsername,
		fromChatId = fromChatId.toLong(),
		messageId = messageId.toInt()
	)


	constructor(chatId: Long, fromChannelUsername: String, messageId: Int) : this(
		chatId = chatId,
		channelUsername = null,

		fromChatId = null,
		fromChannelUsername = fromChannelUsername,

		messageId = messageId
	)

	/**
	 * Backwards-compatability for Java code
	 */
	constructor(chatId: JavaLong, fromChannelUsername: String, messageId: JavaInteger) : this(
		chatId = chatId.toLong(),
		fromChannelUsername = fromChannelUsername,
		messageId = messageId.toInt()
	)


	constructor(channelUsername: String, fromChannelUsername: String, messageId: Int) : this(
		chatId = null,
		channelUsername = channelUsername,

		fromChatId = null,
		fromChannelUsername = fromChannelUsername,

		messageId = messageId
	)

	/**
	 * Backwards-compatability for Java code
	 */
	constructor(channelUsername: String, fromChannelUsername: String, messageId: JavaInteger) : this(
		channelUsername = channelUsername,
		fromChannelUsername = fromChannelUsername,
		messageId = messageId.toInt()
	)


	@Deprecated(
		"Use constructor with chatId and fromChatId or channelUsername and fromChannelUsername instead",
		ReplaceWith("ForwardMessage(chatId, fromChatId, messageId)")
	)
	constructor(chatId: Any, fromChatId: Any, messageId: Int) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		fromChatId = (fromChatId as? Number)?.toLong(),
		fromChannelUsername = fromChatId as? String,
		messageId = messageId
	) {
		if (this.chatId == null && this.channelUsername == null) {
			throw IllegalArgumentException("chatId parameter must be either Long or String")
		}

		if (this.fromChatId == null && this.fromChannelUsername == null) {
			throw IllegalArgumentException("fromChatId parameter must be either Long or String")
		}
	}

	/**
	 * Backwards-compatability for Java code
	 */
	@Suppress("DEPRECATION")
	@Deprecated(
		"Use constructor with chatId and fromChatId or channelUsername and fromChannelUsername instead",
		ReplaceWith("ForwardMessage(chatId, fromChatId, messageId)")
	)
	constructor(chatId: Any, fromChatId: Any, messageId: JavaInteger) : this(
		chatId = chatId,
		fromChatId = fromChatId,
		messageId = messageId.toInt()
	)

	val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
	val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")

	val fromChatId: Long? by optionalRequestParameter(fromChatId, customParameterName = "from_chat_id")
	val fromChannelUsername: String? by optionalRequestParameter(fromChannelUsername, customParameterName = "from_chat_id")

	val messageId: Int by requestParameter(messageId)

	var messageThreadId: Int? by optionalRequestParameter()

	var caption: String? by optionalRequestParameter()
	var parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()

	var replyParameters: _root_ide_package_.ru.ravel.rtelebots.model.request.ReplyParameters? by optionalRequestParameter()

	var replyMarkup: _root_ide_package_.ru.ravel.rtelebots.model.request.Keyboard? by optionalRequestParameter()
	var showCaptionAboveMedia: Boolean? by optionalRequestParameter()
	var disableNotification: Boolean? by optionalRequestParameter()
	var protectContent: Boolean? by optionalRequestParameter()
	var videoStartTimestamp: Int? by optionalRequestParameter()
	var allowPaidBroadcast: Boolean? by optionalRequestParameter()

	fun messageThreadId(messageThreadId: Int) = applySelf { this.messageThreadId = messageThreadId }

	fun caption(caption: String) = applySelf { this.caption = caption }

	fun parseMode(parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.parseMode = parseMode }

	fun captionEntities(captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	fun captionEntities(vararg captionEntities: _root_ide_package_.ru.ravel.rtelebots.model.MessageEntity) =
		applySelf { this.captionEntities = captionEntities.toList() }

	fun replyParameters(parameters: _root_ide_package_.ru.ravel.rtelebots.model.request.ReplyParameters) =
		applySelf { this.replyParameters = parameters }

	fun replyMarkup(replyMarkup: _root_ide_package_.ru.ravel.rtelebots.model.request.Keyboard) =
		applySelf { this.replyMarkup = replyMarkup }

	fun showCaptionAboveMedia(showCaptionAboveMedia: Boolean) = applySelf { this.showCaptionAboveMedia = showCaptionAboveMedia }

	fun disableNotification(disableNotification: Boolean) = applySelf { this.disableNotification = disableNotification }

	fun protectContent(protectContent: Boolean) = applySelf { this.protectContent = protectContent }

	fun videoStartTimestamp(videoStartTimestamp: Int) = applySelf { this.videoStartTimestamp = videoStartTimestamp }

	fun allowPaidBroadcast(allowPaidBroadcast: Boolean) = applySelf { this.allowPaidBroadcast = allowPaidBroadcast }

}