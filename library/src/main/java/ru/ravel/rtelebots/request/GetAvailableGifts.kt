package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.response.GetAvailableGiftsResponse

class GetAvailableGifts : KBaseRequest<GetAvailableGifts, GetAvailableGiftsResponse>(
	GetAvailableGiftsResponse::class
)