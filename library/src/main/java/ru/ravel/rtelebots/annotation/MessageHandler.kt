package ru.ravel.rtelebots.annotation

import org.jetbrains.annotations.ApiStatus


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@ApiStatus.Internal
annotation class MessageHandler(
	val value: String = "",
	val contentType: ContentType,
	val ignoreValue: Boolean = false,
)