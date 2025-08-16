package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import java.io.File

class SendAnimation private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	animationUrl: String? = null,
	animationFile: File? = null,
	animationBytes: ByteArray? = null
) : AbstractThumbnailedMultipartRequest<SendAnimation>(
	chatId = chatId,
	channelUsername = channelUsername,

	contentParameterName = "animation",
	contentUrl = animationUrl,
	contentFile = animationFile,
	contentBytes = animationBytes,

	defaultFileName = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.GIF_FILE_NAME,
	defaultContentType = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.GIF_MIME_TYPE
) {


	constructor(chatId: Long, animationUrl: String) : this(
		chatId = chatId,
		channelUsername = null,
		animationUrl = animationUrl
	)

	constructor(channelUsername: String, animationUrl: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		animationUrl = animationUrl
	)


	constructor(chatId: Long, animationFile: File) : this(
		chatId = chatId,
		channelUsername = null,
		animationFile = animationFile
	)

	constructor(channelUsername: String, animationFile: File) : this(
		chatId = null,
		channelUsername = channelUsername,
		animationFile = animationFile
	)


	constructor(chatId: Long, animationBytes: ByteArray) : this(
		chatId = chatId,
		channelUsername = null,
		animationBytes = animationBytes
	)

	constructor(channelUsername: String, animationBytes: ByteArray) : this(
		chatId = null,
		channelUsername = channelUsername,
		animationBytes = animationBytes
	)


	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendAnimation(chatId, animation)"))
	constructor(chatId: Any, animation: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		animationUrl = animation
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendAnimation(chatId, animation)"))
	constructor(chatId: Any, animation: File) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		animationFile = animation
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendAnimation(chatId, animation)"))
	constructor(chatId: Any, animation: ByteArray) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		animationBytes = animation
	) {
		checkDeprecatedConstructorParameters()
	}

	var caption: String? by optionalRequestParameter()
	var parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()
	var showCaptionAboveMedia: Boolean? by optionalRequestParameter()
	var hasSpoiler: Boolean? by optionalRequestParameter()

	var duration: Int? by optionalRequestParameter()
	var width: Int? by optionalRequestParameter()
	var height: Int? by optionalRequestParameter()

	fun caption(caption: String) = apply { this.caption = caption }

	fun parseMode(parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode) = apply { this.parseMode = parseMode }

	fun captionEntities(captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		apply { this.captionEntities = captionEntities }

	fun captionEntities(vararg captionEntities: _root_ide_package_.ru.ravel.rtelebots.model.MessageEntity) =
		apply { this.captionEntities = captionEntities.toList() }

	fun showCaptionAboveMedia(showCaptionAboveMedia: Boolean) = apply { this.showCaptionAboveMedia = showCaptionAboveMedia }

	fun hasSpoiler(hasSpoiler: Boolean) = apply { this.hasSpoiler = hasSpoiler }

	fun duration(duration: Int) = apply { this.duration = duration }

	fun width(width: Int) = apply { this.width = width }

	fun height(height: Int) = apply { this.height = height }

}