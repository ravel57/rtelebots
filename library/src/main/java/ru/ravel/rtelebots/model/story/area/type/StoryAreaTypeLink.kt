package ru.ravel.rtelebots.model.story.area.type

@Suppress("unused")
class StoryAreaTypeLink(
	@get:JvmName("url") val url: String
) : StoryAreaType(type = "link")