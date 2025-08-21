package ru.ravel.rtelebots.model.gift

data class Gift(
	@get:JvmName("id") val id: String,
	@get:JvmName("sticker") val sticker: ru.ravel.rtelebots.model.Sticker,
	@get:JvmName("starCount") val starCount: Int,
	@get:JvmName("upgradeStarCount") val upgradeStarCount: Int? = null,
	@get:JvmName("totalCount") val totalCount: Int? = null,
	@get:JvmName("remainingCount") val remainingCount: Int? = null
)
