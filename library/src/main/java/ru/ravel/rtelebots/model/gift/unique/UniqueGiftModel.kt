package ru.ravel.rtelebots.model.gift.unique

data class UniqueGiftModel(
	@get:JvmName("name") val name: String,
	@get:JvmName("sticker") val sticker: ru.ravel.rtelebots.model.Sticker,
	@get:JvmName("rarityPerMille") val rarityPerMille: Int
)