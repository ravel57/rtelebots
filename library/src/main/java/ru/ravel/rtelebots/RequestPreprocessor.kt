package ru.ravel.rtelebots

import ru.ravel.rtelebots.request.BaseRequest
import ru.ravel.rtelebots.response.BaseResponse

@get:JvmName("getEmptyRequestPreprocessor")
val EMPTY_REQUEST_PREPROCESSOR: RequestPreprocessor = object : RequestPreprocessor {
	override fun <REQ : BaseRequest<REQ, RES>, RES : BaseResponse> process(request: BaseRequest<REQ, RES>) {
		// do nothing
	}
}

interface RequestPreprocessor {

	fun <REQ : BaseRequest<REQ, RES>, RES : BaseResponse> process(request: BaseRequest<REQ, RES>)

}