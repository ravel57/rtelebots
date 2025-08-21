package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.utility.kotlin.checkDeprecatedConstructorParameters
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SendPoll private constructor(
	chatId: Long? = null,
	channelUsername: String? = null,

	question: String,
	options: List<ru.ravel.rtelebots.model.request.InputPollOption>
) : AbstractSendRequest<SendPoll>(
	chatId = chatId,
	channelUsername = channelUsername,
) {

	constructor(
		chatId: Long,
		question: String,
		options: List<ru.ravel.rtelebots.model.request.InputPollOption>
	) : this(
		chatId = chatId,
		channelUsername = null,
		question = question,
		options = options
	)

	constructor(
		channelUsername: String,
		question: String,
		options: List<ru.ravel.rtelebots.model.request.InputPollOption>
	) : this(
		chatId = null,
		channelUsername = channelUsername,
		question = question,
		options = options
	)

	@Deprecated("Use constructor with chatId or channelUsername instead", ReplaceWith("SendPoll(chatId, question, options)"))
	constructor(
		chatId: Any,
		question: String,
		vararg options: ru.ravel.rtelebots.model.request.InputPollOption
	) : this(
		chatId = (chatId as? Number)?.toLong(),
		channelUsername = chatId as? String,
		question = question,
		options = options.toList()
	) {
		checkDeprecatedConstructorParameters()
	}

	val question: String by requestParameter(question)
	val options: List<ru.ravel.rtelebots.model.request.InputPollOption> by requestParameter(options)

	var type: ru.ravel.rtelebots.model.Poll.Type? by optionalRequestParameter()
	var typeRaw: String? by optionalRequestParameter(customParameterName = "type")

	var isAnonymous: Boolean? by optionalRequestParameter()
	var allowsMultipleAnswers: Boolean? by optionalRequestParameter()
	var correctOptionId: Int? by optionalRequestParameter()

	var questionParseMode: ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var questionEntities: List<ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()

	var explanation: String? by optionalRequestParameter()
	var explanationParseMode: ru.ravel.rtelebots.model.request.ParseMode? by optionalRequestParameter()
	var explanationEntities: List<ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter()

	var openPeriod: Int? by optionalRequestParameter()
	var closeDate: Long? by optionalRequestParameter()
	var isClosed: Boolean? by optionalRequestParameter()

	fun type(type: ru.ravel.rtelebots.model.Poll.Type) = applySelf { this.type = type }

	fun type(typeRaw: String) = applySelf { this.typeRaw = typeRaw }

	fun isAnonymous(isAnonymous: Boolean) = applySelf { this.isAnonymous = isAnonymous }

	fun allowsMultipleAnswers(allowMultipleAnswers: Boolean) = applySelf { this.allowsMultipleAnswers = allowMultipleAnswers }

	fun correctOptionId(correctOptionId: Int) = applySelf { this.correctOptionId = correctOptionId }

	fun questionParseMode(questionParseMode: ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.questionParseMode = questionParseMode }

	fun questionEntities(questionEntities: List<ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.questionEntities = questionEntities }

	fun questionEntities(vararg questionEntities: ru.ravel.rtelebots.model.MessageEntity) =
		questionEntities(questionEntities.toList())

	fun explanation(explanation: String) = applySelf { this.explanation = explanation }

	fun explanationParseMode(explanationParseMode: ru.ravel.rtelebots.model.request.ParseMode) =
		applySelf { this.explanationParseMode = explanationParseMode }

	fun explanationEntities(explanationEntities: List<ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.explanationEntities = explanationEntities }

	fun explanationEntities(vararg explanationEntities: ru.ravel.rtelebots.model.MessageEntity) =
		explanationEntities(explanationEntities.toList())

	fun openPeriod(openPeriod: Int) = applySelf { this.openPeriod = openPeriod }

	fun closeDate(closeDate: Long) = applySelf { this.closeDate = closeDate }

	fun isClosed(isClosed: Boolean) = applySelf { this.isClosed = isClosed }

}