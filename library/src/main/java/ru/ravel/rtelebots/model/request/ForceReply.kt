package ru.ravel.rtelebots.model.request

/**
 * stas
 * 8/4/15.
 */
data class ForceReply @JvmOverloads constructor(
	@get:JvmName("selective") var selective: Boolean = false,
	@get:JvmName("inputFieldPlaceholder") var inputFieldPlaceholder: String? = null
) : _root_ide_package_.ru.ravel.rtelebots.model.request.Keyboard() {
	private val force_reply = true

	fun inputFieldPlaceholder(inputFieldPlaceholder: String?): ForceReply {
		this.inputFieldPlaceholder = inputFieldPlaceholder
		return this
	}

	fun selective(selective: Boolean): ForceReply {
		this.selective = selective
		return this
	}


}
