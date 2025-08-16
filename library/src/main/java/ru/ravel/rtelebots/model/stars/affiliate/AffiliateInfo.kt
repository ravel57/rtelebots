package ru.ravel.rtelebots.model.stars.affiliate

data class AffiliateInfo(
	@get:JvmName("affiliateUser") val affiliateUser: _root_ide_package_.ru.ravel.rtelebots.model.User? = null,
	@get:JvmName("affiliateChat") val affiliateChat: _root_ide_package_.ru.ravel.rtelebots.model.Chat? = null,
	@get:JvmName("commissionPerMille") val commissionPerMille: Int,
	@get:JvmName("amount") val amount: Int,
	@get:JvmName("nanostarAmount") val nanostarAmount: Int? = null
)
