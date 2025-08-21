package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.response.SavePreparedInlineMessageResponse
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SavePreparedInlineMessage(
	userId: Long,
	result: ru.ravel.rtelebots.model.request.InlineQueryResult<*>
) : KBaseRequest<SavePreparedInlineMessage, SavePreparedInlineMessageResponse>(
	SavePreparedInlineMessageResponse::class
) {

	val userId: Long by requestParameter(userId, customParameterName = "user_id")
	val result: ru.ravel.rtelebots.model.request.InlineQueryResult<*> by requestParameter(result)

	var allowUserChats: Boolean? by optionalRequestParameter()
	var allowBotChats: Boolean? by optionalRequestParameter()
	var allowGroupChats: Boolean? by optionalRequestParameter()
	var allowChannelChats: Boolean? by optionalRequestParameter()

	fun allowUserChats(allowUserChats: Boolean) = apply { this.allowUserChats = allowUserChats }

	fun allowBotChats(allowBotChats: Boolean) = apply { this.allowBotChats = allowBotChats }

	fun allowGroupChats(allowGroupChats: Boolean) = apply { this.allowGroupChats = allowGroupChats }

	fun allowChannelChats(allowChannelChats: Boolean) = apply { this.allowChannelChats = allowChannelChats }

}