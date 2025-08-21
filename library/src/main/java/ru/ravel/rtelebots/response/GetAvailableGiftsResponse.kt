package ru.ravel.rtelebots.response

import ru.ravel.rtelebots.model.gift.Gifts

data class GetAvailableGiftsResponse(val result: Gifts) : BaseResponse()
