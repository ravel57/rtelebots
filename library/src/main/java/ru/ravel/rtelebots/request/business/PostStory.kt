package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.model.story.StoryArea
import ru.ravel.rtelebots.model.story.inputstory.InputStoryContent
import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.response.PostStoryResponse
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class PostStory private constructor(
	businessConnectionId: String,
	content: InputStoryContent,
	activePeriod: Int,
	caption: String?,
	parseMode: String?,
	captionEntities: Array<ru.ravel.rtelebots.model.MessageEntity>?,
	areas: Array<StoryArea>?,
	postToChatPage: Boolean?,
	protectContent: Boolean?
) : KBaseRequest<PostStory, PostStoryResponse>(PostStoryResponse::class) {

	constructor(businessConnectionId: String, content: InputStoryContent, activePeriod: Int) : this(
		businessConnectionId = businessConnectionId,
		content = content,
		activePeriod = activePeriod,
		caption = null,
		parseMode = null,
		captionEntities = null,
		areas = null,
		postToChatPage = null,
		protectContent = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val content: InputStoryContent by requestParameter(content, customParameterName = "content")
	val activePeriod: Int by requestParameter(activePeriod, customParameterName = "active_period")

	var caption: String? by optionalRequestParameter(caption, customParameterName = "caption")
	fun caption(caption: String) = applySelf { this.caption = caption }

	var parseMode: String? by optionalRequestParameter(parseMode, customParameterName = "parse_mode")
	fun parseMode(parseMode: String) = applySelf { this.parseMode = parseMode }

	var captionEntities: Array<ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter(
		captionEntities,
		customParameterName = "caption_entities"
	)

	fun captionEntities(captionEntities: Array<ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	var areas: Array<StoryArea>? by optionalRequestParameter(areas, customParameterName = "areas")
	fun areas(areas: Array<StoryArea>) = applySelf { this.areas = areas }

	var postToChatPage: Boolean? by optionalRequestParameter(postToChatPage, customParameterName = "post_to_chat_page")
	fun postToChatPage(postToChatPage: Boolean) = applySelf { this.postToChatPage = postToChatPage }

	var protectContent: Boolean? by optionalRequestParameter(protectContent, customParameterName = "protect_content")
	fun protectContent(protectContent: Boolean) = applySelf { this.protectContent = protectContent }

}