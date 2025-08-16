package ru.ravel.rtelebots.model.stars.partner

import ru.ravel.rtelebots.model.stars.partner.TransactionPartnerType.AFFILIATE_PROGRAM

data class TransactionPartnerAffiliateProgram(
	@get:JvmName("sponsorUser") val sponsorUser: _root_ide_package_.ru.ravel.rtelebots.model.User? = null,
	@get:JvmName("commissionPerMille") val commissionPerMille: Int
) : TransactionPartner {

	override val type: String
		get() = AFFILIATE_PROGRAM

}
