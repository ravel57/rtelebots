package ru.ravel.rtelebots

import ru.ravel.rtelebots.request.BaseRequest
import ru.ravel.rtelebots.response.BaseResponse

interface TelegramAware {

	fun <REQ : BaseRequest<REQ, RES>, RES : BaseResponse> execute(request: BaseRequest<REQ, RES>): RES

}