package ru.ravel.rtelebots.model.gift

data class GiftInfo(
	@get:JvmName("gift") val gift: Gift,
	@get:JvmName("ownedGiftId") val ownedGiftId: String?,
	@get:JvmName("convertStarCount") val convertStarCount: Int?,
	@get:JvmName("prepaidUpgradeStarCount") val prepaidUpgradeStarCount: Int?,
	@get:JvmName("canBeUpgraded") val canBeUpgraded: Boolean?,
	@get:JvmName("text") val text: String?,
	@get:JvmName("entities") val entities: Array<_root_ide_package_.ru.ravel.rtelebots.model.MessageEntity>?,
	@get:JvmName("isPrivate") val isPrivate: Boolean?,
) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other !is GiftInfo) return false

		return gift == other.gift &&
				ownedGiftId == other.ownedGiftId &&
				convertStarCount == other.convertStarCount &&
				prepaidUpgradeStarCount == other.prepaidUpgradeStarCount &&
				canBeUpgraded == other.canBeUpgraded &&
				text == other.text &&
				entities contentEquals other.entities &&
				isPrivate == other.isPrivate
	}

	override fun hashCode(): Int {
		var result = gift.hashCode()
		result = 31 * result + (ownedGiftId?.hashCode() ?: 0)
		result = 31 * result + (convertStarCount ?: 0)
		result = 31 * result + (prepaidUpgradeStarCount ?: 0)
		result = 31 * result + (canBeUpgraded?.hashCode() ?: 0)
		result = 31 * result + (text?.hashCode() ?: 0)
		result = 31 * result + (entities?.contentHashCode() ?: 0)
		result = 31 * result + (isPrivate?.hashCode() ?: 0)
		return result
	}

	override fun toString(): String {
		return "GiftInfo(gift=$gift, ownedGiftId=$ownedGiftId, convertStarCount=$convertStarCount, " +
				"prepaidUpgradeStarCount=$prepaidUpgradeStarCount, canBeUpgraded=$canBeUpgraded, " +
				"text=$text, entities=${entities?.contentToString()}, isPrivate=$isPrivate)"
	}

}