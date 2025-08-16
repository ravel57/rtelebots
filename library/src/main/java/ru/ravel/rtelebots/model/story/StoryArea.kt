package ru.ravel.rtelebots.model.story

import ru.ravel.rtelebots.model.story.area.StoryAreaPosition
import ru.ravel.rtelebots.model.story.area.type.StoryAreaType

@Suppress("unused")
class StoryArea(
	@get:JvmName("position") val position: StoryAreaPosition,
	@get:JvmName("type") val type: StoryAreaType
)