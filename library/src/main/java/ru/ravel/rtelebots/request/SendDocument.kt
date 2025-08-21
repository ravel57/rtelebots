package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import java.io.File

class SendDocument private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	documentUrl: String? = null,
	documentFile: File? = null,
	documentBytes: ByteArray? = null
) : AbstractThumbnailedMultipartRequest<SendDocument>(
	chatId = chatId,
	channelUsername = channelUsername,

	contentParameterName = "document",
	contentUrl = documentUrl,
	contentFile = documentFile,
	contentBytes = documentBytes,

	defaultFileName = ContentTypes.DOC_FILE_NAME,
	defaultContentType = ContentTypes.DOC_MIME_TYPE
) {


	constructor(chatId: Long, documentUrl: String) : this(
		chatId = chatId,
		channelUsername = null,
		documentUrl = documentUrl
	)

	constructor(channelUsername: String, documentUrl: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		documentUrl = documentUrl
	)


	constructor(chatId: Long, documentFile: File) : this(
		chatId = chatId,
		channelUsername = null,
		documentFile = documentFile
	)

	constructor(channelUsername: String, documentFile: File) : this(
		chatId = null,
		channelUsername = channelUsername,
		documentFile = documentFile
	)


	constructor(chatId: Long, documentBytes: ByteArray) : this(
		chatId = chatId,
		channelUsername = null,
		documentBytes = documentBytes
	)

	constructor(channelUsername: String, documentBytes: ByteArray) : this(
		chatId = null,
		channelUsername = channelUsername,
		documentBytes = documentBytes
	)


	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendDocument(chatId, document)"))
	constructor(chatId: Any, document: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		documentUrl = document
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendDocument(chatId, document)"))
	constructor(chatId: Any, document: File) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		documentFile = document
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendDocument(chatId, document)"))
	constructor(chatId: Any, document: ByteArray) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		documentBytes = document
	) {
		checkDeprecatedConstructorParameters()
	}

	var caption: String? by optionalRequestParameter()
	var parseMode: ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var captionEntities: List<ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()

	var disableContentTypeDetection: Boolean? by optionalRequestParameter()

	fun caption(caption: String) = applySelf { this.caption = caption }

	fun parseMode(parseMode: ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.parseMode = parseMode }

	fun captionEntities(captionEntities: List<ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	fun captionEntities(vararg captionEntities: ru.ravel.rtelebots.model.MessageEntity) =
		captionEntities(captionEntities.toList())

	fun disableContentTypeDetection(disableContentTypeDetection: Boolean) =
		applySelf { this.disableContentTypeDetection = disableContentTypeDetection }

}