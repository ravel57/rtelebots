package ru.ravel.rtelebots.model.gift.unique

@Suppress("unused")
data class UniqueGiftInfo(
	@get:JvmName("gift") val gift: UniqueGift,
	@get:JvmName("origin") val origin: String,
	@get:JvmName("ownedGiftId") val ownedGiftId: String?,
	@get:JvmName("transferStarCount") val transferStarCount: Int?
)