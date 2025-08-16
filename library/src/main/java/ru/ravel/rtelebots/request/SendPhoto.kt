package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import java.io.File

class SendPhoto private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	photoUrl: String? = null,
	photoFile: File? = null,
	photoBytes: ByteArray? = null
) : AbstractMultipartRequest<SendPhoto>(
	chatId = chatId,
	channelUsername = channelUsername,

	contentParameterName = "photo",
	contentUrl = photoUrl,
	contentFile = photoFile,
	contentBytes = photoBytes,

	defaultFileName = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.PHOTO_FILE_NAME,
	defaultContentType = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.PHOTO_MIME_TYPE
) {

	constructor(chatId: Long, photoUrl: String) : this(
		chatId = chatId,
		channelUsername = null,
		photoUrl = photoUrl
	)

	constructor(channelUsername: String, photoUrl: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		photoUrl = photoUrl
	)


	constructor(chatId: Long, photoFile: File) : this(
		chatId = chatId,
		channelUsername = null,
		photoFile = photoFile
	)

	constructor(channelUsername: String, photoFile: File) : this(
		chatId = null,
		channelUsername = channelUsername,
		photoFile = photoFile
	)


	constructor(chatId: Long, photoBytes: ByteArray) : this(
		chatId = chatId,
		channelUsername = null,
		photoBytes = photoBytes
	)

	constructor(channelUsername: String, photoBytes: ByteArray) : this(
		chatId = null,
		channelUsername = channelUsername,
		photoBytes = photoBytes
	)


	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendPhoto(chatId, photo)"))
	constructor(chatId: Any, photo: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		photoUrl = photo
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendPhoto(chatId, photo)"))
	constructor(chatId: Any, photo: File) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		photoFile = photo
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendPhoto(chatId, photo)"))
	constructor(chatId: Any, photo: ByteArray) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		photoBytes = photo
	) {
		checkDeprecatedConstructorParameters()
	}

	var caption: String? by optionalRequestParameter()
	var parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()
	var showCaptionAboveMedia: Boolean? by optionalRequestParameter()
	var hasSpoiler: Boolean? by optionalRequestParameter()

	fun caption(caption: String) = applySelf { this.caption = caption }

	fun parseMode(parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.parseMode = parseMode }

	fun captionEntities(captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	fun captionEntities(vararg captionEntities: _root_ide_package_.ru.ravel.rtelebots.model.MessageEntity) =
		applySelf { this.captionEntities = captionEntities.toList() }

	fun showCaptionAboveMedia(showCaptionAboveMedia: Boolean) = applySelf { this.showCaptionAboveMedia = showCaptionAboveMedia }

	fun hasSpoiler(hasSpoiler: Boolean) = applySelf { this.hasSpoiler = hasSpoiler }

}