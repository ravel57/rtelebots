package ru.ravel.rtelebots.annotation


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class InlineMessageHandler(
	val value: String = "",
	val ignoreInput: Boolean = false,
)