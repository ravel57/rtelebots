package ru.ravel.rtelebots.model.stars.partner

import ru.ravel.rtelebots.model.stars.partner.TransactionPartnerType.TELEGRAM_API

data class TransactionPartnerTelegramApi(
	@get:JvmName("requestCount") val requestCount: Int
) : TransactionPartner {

	override val type: String
		get() = TELEGRAM_API

}
