package ru.ravel.rtelebots.model.paidmedia

data class PaidMediaPurchased(
	@get:JvmName("user") val from: ru.ravel.rtelebots.model.User,
	@get:JvmName("paidMediaPayload") val paidMediaPayload: String
)