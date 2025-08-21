package ru.ravel.rtelebots.model.gift.owned

import ru.ravel.rtelebots.model.gift.Gift

@Suppress("unused")
class OwnedGiftUnique(
	@get:JvmName("gift") val gift: Gift,
	@get:JvmName("ownedGiftId") var ownedGiftId: String?,
	@get:JvmName("senderUser") var senderUser: ru.ravel.rtelebots.model.User?,
	@get:JvmName("sendDate") var sendDate: Long,
	@get:JvmName("isSaved") var isSaved: Boolean?,
	@get:JvmName("canBeTransferred") var canBeTransferred: Boolean?,
	@get:JvmName("transferStarCount") var prepaidUpgradeStarCount: Int?
) : OwnedGift(type = TYPE) {

	companion object {
		const val TYPE = "unique"
	}

}