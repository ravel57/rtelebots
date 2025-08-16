@file:Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package ru.ravel.rtelebots.utility.kotlin

import ru.ravel.rtelebots.request.AbstractSendRequest

typealias JavaInteger = java.lang.Integer

typealias JavaLong = java.lang.Long

@Suppress("NOTHING_TO_INLINE")
inline fun AbstractSendRequest<*>.checkDeprecatedConstructorParameters() {
	if (this.chatId == null && this.channelUsername == null) {
		throw IllegalArgumentException("chatId parameter must be either Long or String")
	}
}