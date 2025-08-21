package ru.ravel.rtelebots.model.stars.partner

import ru.ravel.rtelebots.model.gift.Gift
import ru.ravel.rtelebots.model.stars.affiliate.AffiliateInfo
import ru.ravel.rtelebots.model.stars.partner.TransactionPartnerType.USER

data class TransactionPartnerUser(
	@get:JvmName("transactionType") val transactionType: String,
	@get:JvmName("user") val user: ru.ravel.rtelebots.model.User,
	@get:JvmName("affiliate") val affiliate: AffiliateInfo,
	@get:JvmName("invoicePayload") val invoicePayload: String? = null,
	@get:JvmName("paidMedia") val paidMedia: Array<ru.ravel.rtelebots.model.paidmedia.PaidMedia>? = null,
	@get:JvmName("paidMediaPayload") val paidMediaPayload: String? = null,
	@get:JvmName("subscriptionPeriod") val subscriptionPeriod: Int? = null,
	@get:JvmName("gift") val gift: Gift? = null,
	@get:JvmName("premiumSubscriptionDuration") val premiumSubscriptionDuration: Int? = null
) : TransactionPartner {

	override val type: String
		get() = USER

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as TransactionPartnerUser

		if (subscriptionPeriod != other.subscriptionPeriod) return false
		if (transactionType != other.transactionType) return false
		if (user != other.user) return false
		if (affiliate != other.affiliate) return false
		if (invoicePayload != other.invoicePayload) return false
		if (paidMedia != null) {
			if (other.paidMedia == null) return false
			if (!paidMedia.contentEquals(other.paidMedia)) return false
		} else if (other.paidMedia != null) return false
		if (paidMediaPayload != other.paidMediaPayload) return false
		if (gift != other.gift) return false
		if (premiumSubscriptionDuration != other.premiumSubscriptionDuration) return false
		if (type != other.type) return false

		return true
	}

	override fun hashCode(): Int {
		var result = subscriptionPeriod ?: 0
		result = 31 * result + transactionType.hashCode()
		result = 31 * result + user.hashCode()
		result = 31 * result + affiliate.hashCode()
		result = 31 * result + (invoicePayload?.hashCode() ?: 0)
		result = 31 * result + (paidMedia?.contentHashCode() ?: 0)
		result = 31 * result + (paidMediaPayload?.hashCode() ?: 0)
		result = 31 * result + (gift?.hashCode() ?: 0)
		result = 31 * result + (premiumSubscriptionDuration?.hashCode() ?: 0)
		result = 31 * result + type.hashCode()
		return result
	}


}