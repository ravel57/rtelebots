package ru.ravel.rtelebots.model.stars

import ru.ravel.rtelebots.model.stars.partner.TransactionPartner

data class StarTransaction(
	@get:JvmName("id") val id: String,
	@get:JvmName("amount") val amount: Int,
	@get:JvmName("nanostarAmount") val nanostarAmount: Int? = null,
	@get:JvmName("date") val date: Int,
	@get:JvmName("source") val source: TransactionPartner? = null,
	@get:JvmName("receiver") val receiver: TransactionPartner? = null
)
