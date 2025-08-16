package ru.ravel.rtelebots

interface TelegramAware {

	fun <REQ : _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>, RES : _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse> execute(
		request: _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<REQ, RES>
	): RES

}