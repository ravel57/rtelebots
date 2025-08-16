package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.model.story.StoryArea
import ru.ravel.rtelebots.model.story.inputstory.InputStoryContent
import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.response.EditStoryResponse
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class EditStory private constructor(
	businessConnectionId: String,
	storyId: Int,
	content: InputStoryContent,
	caption: String?,
	parseMode: String?,
	captionEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>?,
	areas: Array<StoryArea>?
) : KBaseRequest<EditStory, EditStoryResponse>(EditStoryResponse::class) {

	constructor(businessConnectionId: String, storyId: Int, content: InputStoryContent) : this(
		businessConnectionId = businessConnectionId,
		storyId = storyId,
		content = content,
		caption = null,
		parseMode = null,
		captionEntities = null,
		areas = null
	)

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val storyId: Int by requestParameter(storyId, customParameterName = "story_id")
	val content: InputStoryContent by requestParameter(content, customParameterName = "content")

	var caption: String? by optionalRequestParameter(caption, customParameterName = "caption")
	fun caption(caption: String) = applySelf { this.caption = caption }

	var parseMode: String? by optionalRequestParameter(parseMode, customParameterName = "parse_mode")
	fun parseMode(parseMode: String) = applySelf { this.parseMode = parseMode }

	var captionEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>? by optionalRequestParameter(
		captionEntities,
		customParameterName = "caption_entities"
	)

	fun captionEntities(captionEntities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) =
		applySelf { this.captionEntities = captionEntities }

	var areas: Array<StoryArea>? by optionalRequestParameter(areas, customParameterName = "areas")
	fun areas(areas: Array<StoryArea>) = applySelf { this.areas = areas }

}