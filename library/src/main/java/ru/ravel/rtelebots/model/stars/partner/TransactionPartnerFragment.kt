package ru.ravel.rtelebots.model.stars.partner

import ru.ravel.rtelebots.model.stars.partner.TransactionPartnerType.FRAGMENT

data class TransactionPartnerFragment(
	@get:JvmName("withdrawalState") val withdrawalState: ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalState? = null
) : TransactionPartner {

	override val type: String
		get() = FRAGMENT

}