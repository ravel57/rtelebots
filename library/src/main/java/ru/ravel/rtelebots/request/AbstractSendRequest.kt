package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.model.request.Keyboard
import ru.ravel.rtelebots.model.request.ReplyParameters
import ru.ravel.rtelebots.response.SendResponse
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter

abstract class AbstractSendRequest<REQ : AbstractSendRequest<REQ>>(
	chatId: Long?,
	channelUsername: String?
) : KBaseRequest<REQ, SendResponse>(SendResponse::class) {

	val chatId: Long? by optionalRequestParameter(chatId, customParameterName = "chat_id")
	val channelUsername: String? by optionalRequestParameter(channelUsername, customParameterName = "chat_id")

	var businessConnectionId: String? by optionalRequestParameter()
	var messageThreadId: Int? by optionalRequestParameter()
	var disableNotification: Boolean? by optionalRequestParameter()
	var protectContent: Boolean? by optionalRequestParameter()
	var allowPaidBroadcast: Boolean? by optionalRequestParameter()
	var messageEffectId: String? by optionalRequestParameter()
	var replyParameters: ReplyParameters? by optionalRequestParameter()
	var replyMarkup: Keyboard? by optionalRequestParameter()

	fun businessConnectionId(businessConnectionId: String) = applySelf { this.businessConnectionId = businessConnectionId }

	fun messageThreadId(messageThreadId: Int) = applySelf { this.messageThreadId = messageThreadId }

	fun disableNotification(disableNotification: Boolean) = applySelf { this.disableNotification = disableNotification }

	fun protectContent(protectContent: Boolean) = applySelf { this.protectContent = protectContent }

	fun allowPaidBroadcast(allowPaidBroadcast: Boolean) = applySelf { this.allowPaidBroadcast = allowPaidBroadcast }

	fun messageEffectId(messageEffectId: String) = applySelf { this.messageEffectId = messageEffectId }

	fun replyParameters(replyParameters: ReplyParameters) =
		applySelf { this.replyParameters = replyParameters }

	fun replyMarkup(replyMarkup: Keyboard) =
		applySelf { this.replyMarkup = replyMarkup }

}