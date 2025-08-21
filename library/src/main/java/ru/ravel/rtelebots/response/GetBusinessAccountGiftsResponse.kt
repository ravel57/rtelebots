package ru.ravel.rtelebots.response

import ru.ravel.rtelebots.model.gift.owned.OwnedGifts

data class GetBusinessAccountGiftsResponse(val result: OwnedGifts) : BaseResponse()
