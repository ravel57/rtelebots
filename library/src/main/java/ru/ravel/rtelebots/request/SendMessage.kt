package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SendMessage private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	text: String
) : AbstractSendRequest<SendMessage>(
	chatId = chatId,
	channelUsername = channelUsername,
) {

	constructor(chatId: Long, text: String) : this(
		chatId = chatId,
		channelUsername = null,
		text = text
	)

	constructor(channelUsername: String, text: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		text = text
	)

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendMessage(chatId, text)"))
	constructor(chatId: Any, text: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		text = text
	) {
		checkDeprecatedConstructorParameters()
	}

	val text: String by requestParameter(text)

	var parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var entities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()
	var linkPreviewOptions: _root_ide_package_.ru.ravel.rtelebots.model.LinkPreviewOptions? by optionalRequestParameter()

	fun parseMode(parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.parseMode = parseMode }

	fun entities(entities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.entities = entities }

	fun entities(vararg entities: _root_ide_package_.ru.ravel.rtelebots.model.MessageEntity) = entities(entities.toList())

	fun linkPreviewOptions(linkPreviewOptions: _root_ide_package_.ru.ravel.rtelebots.model.LinkPreviewOptions) =
		applySelf { this.linkPreviewOptions = linkPreviewOptions }

}