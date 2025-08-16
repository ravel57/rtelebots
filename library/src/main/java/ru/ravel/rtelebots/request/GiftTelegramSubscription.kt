package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class GiftTelegramSubscription private constructor(
	userId: Long,
	monthCount: Int,
	starCount: Int,
	text: String?,
	textParseMode: String?,
	textEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>?
) : KBaseRequest<GiftTelegramSubscription, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	constructor(userId: Long, monthCount: Int, starCount: Int) : this(
		userId = userId,
		monthCount = monthCount,
		starCount = starCount,
		text = null,
		textParseMode = null,
		textEntities = null
	)

	val userId: Long by requestParameter(userId, customParameterName = "user_id")
	val monthCount: Int by requestParameter(monthCount, customParameterName = "month_count")
	val starCount: Int by requestParameter(starCount, customParameterName = "star_count")

	var text: String? by optionalRequestParameter(text, customParameterName = "text")
	fun text(text: String) = applySelf { this.text = text }

	var textParseMode: String? by optionalRequestParameter(textParseMode, customParameterName = "text_parse_mode")
	fun textParseMode(textParseMode: String) = applySelf { this.textParseMode = textParseMode }

	var textEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter(
		textEntities,
		customParameterName = "text_entities"
	)

	fun textEntities(textEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.textEntities = textEntities }

}