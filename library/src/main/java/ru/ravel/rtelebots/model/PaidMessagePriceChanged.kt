package ru.ravel.rtelebots.model

data class PaidMessagePriceChanged(
	@get:JvmName("prizeStarCount") val prizeStarCount: Int
)