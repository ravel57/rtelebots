package ru.ravel.rtelebots.response

import ru.ravel.rtelebots.model.stars.StarAmount

data class GetBusinessAccountStarBalanceResponse(val result: StarAmount) :
	BaseResponse()
