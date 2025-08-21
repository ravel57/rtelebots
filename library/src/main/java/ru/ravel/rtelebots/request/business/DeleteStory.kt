package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class DeleteStory(
	businessConnectionId: String,
	storyId: Int
) : KBaseRequest<DeleteStory, ru.ravel.rtelebots.response.BaseResponse>(ru.ravel.rtelebots.response.BaseResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
	val storyId: Int by requestParameter(storyId, customParameterName = "story_id")

}