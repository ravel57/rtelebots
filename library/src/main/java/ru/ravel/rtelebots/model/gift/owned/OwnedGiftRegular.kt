package ru.ravel.rtelebots.model.gift.owned

import ru.ravel.rtelebots.model.gift.Gift

@Suppress("unused")
class OwnedGiftRegular private constructor(
	@get:JvmName("gift") val gift: Gift,
	@get:JvmName("ownedGiftId") var ownedGiftId: String?,
	@get:JvmName("senderUser") var senderUser: _root_ide_package_.ru.ravel.rtelebots.model.User?,
	@get:JvmName("sendDate") val sendDate: Long,
	@get:JvmName("text") var text: String?,
	@get:JvmName("entities") var entities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>?,
	@get:JvmName("isPrivate") var isPrivate: Boolean?,
	@get:JvmName("isSaved") var isSaved: Boolean?,
	@get:JvmName("canBeUpgraded") var canBeUpgraded: Boolean?,
	@get:JvmName("wasRefunded") var wasRefunded: Boolean?,
	@get:JvmName("convertStarCount") var convertStarCount: Int?,
	@get:JvmName("prepaidUpgradeStarCount") var prepaidUpgradeStarCount: Int?
) : OwnedGift(type = TYPE) {

	companion object {
		const val TYPE = "regular"
	}

	constructor(gift: Gift, sendDate: Long) : this(
		gift = gift,
		ownedGiftId = null,
		senderUser = null,
		sendDate = sendDate,
		text = null,
		entities = null,
		isPrivate = null,
		isSaved = null,
		canBeUpgraded = null,
		wasRefunded = null,
		convertStarCount = null,
		prepaidUpgradeStarCount = null,
	)

	fun ownedGiftId(ownedGiftId: String) = apply {
		this.ownedGiftId = ownedGiftId
	}

	fun senderUser(senderUser: _root_ide_package_.ru.ravel.rtelebots.model.User) = apply {
		this.senderUser = senderUser
	}

	fun text(text: String) = apply {
		this.text = text
	}

	fun entities(entities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>) = apply {
		this.entities = entities
	}

	fun isPrivate(isPrivate: Boolean) = apply {
		this.isPrivate = isPrivate
	}

	fun isSaved(isSaved: Boolean) = apply {
		this.isSaved = isSaved
	}

	fun canBeUpgraded(canBeUpgraded: Boolean) = apply {
		this.canBeUpgraded = canBeUpgraded
	}

	fun wasRefunded(wasRefunded: Boolean) = apply {
		this.wasRefunded = wasRefunded
	}

	fun convertStarCount(convertStarCount: Int) = apply {
		this.convertStarCount = convertStarCount
	}

	fun prepaidUpgradeStarCount(prepaidUpgradeStarCount: Int) = apply {
		this.prepaidUpgradeStarCount = prepaidUpgradeStarCount
	}

}