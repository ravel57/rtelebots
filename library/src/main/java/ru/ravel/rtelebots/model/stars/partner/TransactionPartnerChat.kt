package ru.ravel.rtelebots.model.stars.partner

import ru.ravel.rtelebots.model.gift.Gift
import ru.ravel.rtelebots.model.stars.partner.TransactionPartnerType.CHAT

data class TransactionPartnerChat(
	@get:JvmName("chat") val chat: _root_ide_package_.ru.ravel.rtelebots.model.Chat,
	@get:JvmName("gift") val gift: Gift? = null
) : TransactionPartner {

	override val type: String
		get() = CHAT

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as TransactionPartnerChat

		if (chat != other.chat) return false
		if (gift != other.gift) return false
		if (type != other.type) return false

		return true
	}

	override fun hashCode(): Int {
		var result = chat.hashCode()
		result = 31 * result + (gift?.hashCode() ?: 0)
		return result
	}


}