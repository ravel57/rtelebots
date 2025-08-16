package ru.ravel.rtelebots.model.paidmedia

data class PaidMediaPurchased(
	@get:JvmName("user") val from: _root_ide_package_.ru.ravel.rtelebots.model.User,
	@get:JvmName("paidMediaPayload") val paidMediaPayload: String
)