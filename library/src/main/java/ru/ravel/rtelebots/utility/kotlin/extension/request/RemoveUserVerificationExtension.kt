package ru.ravel.rtelebots.utility.kotlin.extension.request

import ru.ravel.rtelebots.TelegramAware
import ru.ravel.rtelebots.request.RemoveUserVerification
import ru.ravel.rtelebots.utility.kotlin.extension.execute

inline fun TelegramAware.removeUserVerification(
	userId: Long,
	modifier: RemoveUserVerification.() -> Unit = {}
) = this.execute(
	RemoveUserVerification(
		userId = userId
	), modifier
)