package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.VerifyUser
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.verifyUser(
	userId: Long,
	customDescription: String? = null,
	modifier: VerifyUser.() -> Unit = {}
) = this.execute(
	VerifyUser(
		userId = userId
	)
) {
	this.customDescription = customDescription
	modifier()
}