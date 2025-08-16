package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import java.io.File

class SendVoice private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	voiceUrl: String? = null,
	voiceFile: File? = null,
	voiceBytes: ByteArray? = null
) : AbstractMultipartRequest<SendVoice>(
	chatId = chatId,
	channelUsername = channelUsername,

	contentParameterName = "voice",
	contentUrl = voiceUrl,
	contentFile = voiceFile,
	contentBytes = voiceBytes,

	defaultFileName = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.VOICE_FILE_NAME,
	defaultContentType = _root_ide_package_.ru.ravel.rtelebots.request.ContentTypes.VOICE_MIME_TYPE
) {

	constructor(chatId: Long, voiceUrl: String) : this(
		chatId = chatId,
		channelUsername = null,
		voiceUrl = voiceUrl
	)

	constructor(channelUsername: String, voiceUrl: String) : this(
		chatId = null,
		channelUsername = channelUsername,
		voiceUrl = voiceUrl
	)


	constructor(chatId: Long, voiceFile: File) : this(
		chatId = chatId,
		channelUsername = null,
		voiceFile = voiceFile
	)

	constructor(channelUsername: String, voiceFile: File) : this(
		chatId = null,
		channelUsername = channelUsername,
		voiceFile = voiceFile
	)


	constructor(chatId: Long, voiceBytes: ByteArray) : this(
		chatId = chatId,
		channelUsername = null,
		voiceBytes = voiceBytes
	)

	constructor(channelUsername: String, voiceBytes: ByteArray) : this(
		chatId = null,
		channelUsername = channelUsername,
		voiceBytes = voiceBytes
	)


	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendVoice(chatId, voice)"))
	constructor(chatId: Any, voice: String) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		voiceUrl = voice
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendVoice(chatId, voice)"))
	constructor(chatId: Any, voice: File) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		voiceFile = voice
	) {
		checkDeprecatedConstructorParameters()
	}

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendVoice(chatId, voice)"))
	constructor(chatId: Any, voice: ByteArray) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		voiceBytes = voice
	) {
		checkDeprecatedConstructorParameters()
	}

	var caption: String? by optionalRequestParameter()
	var parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()
	var duration: Int? by optionalRequestParameter()

	fun caption(caption: String) = applySelf { this.caption = caption }

	fun parseMode(parseMode: _root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.parseMode = parseMode }

	fun captionEntities(captionEntities: List<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	fun captionEntities(vararg captionEntities: _root_ide_package_.ru.ravel.rtelebots.model.MessageEntity) =
		applySelf { this.captionEntities = captionEntities.toList() }

	fun duration(duration: Int) = applySelf { this.duration = duration }

}