package ru.ravel.rtelebots.model.story.inputstory

@Suppress("unused")
class InputStoryContentPhoto(
	@get:JvmName("photo") val photo: String
) : InputStoryContent(type = "photo")