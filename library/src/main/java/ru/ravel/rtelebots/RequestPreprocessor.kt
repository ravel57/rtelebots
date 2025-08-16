package ru.ravel.rtelebots

@get:JvmName("getEmptyRequestPreprocessor")
val EMPTY_REQUEST_PREPROCESSOR: RequestPreprocessor = object : RequestPreprocessor {
	override fun <REQ : _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>, RES : _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse> process(
		request: _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>
	) {
		// do nothing
	}
}

interface RequestPreprocessor {

	fun <REQ : _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>, RES : _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse> process(
		request: _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>
	)

}