package ru.ravel.rtelebots.request.business

import ru.ravel.rtelebots.request.KBaseRequest
import ru.ravel.rtelebots.response.GetBusinessAccountStarBalanceResponse
import ru.ravel.rtelebots.utility.kotlin.requestParameter

@Suppress("unused")
class GetBusinessAccountStarBalance(
	businessConnectionId: String
) : KBaseRequest<GetBusinessAccountStarBalance, GetBusinessAccountStarBalanceResponse>(GetBusinessAccountStarBalanceResponse::class) {

	val businessConnectionId: String by requestParameter(businessConnectionId, customParameterName = "business_connection_id")
}