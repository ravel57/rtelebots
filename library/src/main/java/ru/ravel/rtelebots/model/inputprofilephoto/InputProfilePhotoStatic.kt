package ru.ravel.rtelebots.model.inputprofilephoto

@Suppress("unused")
class InputProfilePhotoStatic(
	@get:JvmName("photo") val photo: String
) : InputProfilePhoto(type = "static")