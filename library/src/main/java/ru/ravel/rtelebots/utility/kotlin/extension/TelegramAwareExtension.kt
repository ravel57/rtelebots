package ru.ravel.rtelebots.utility.kotlin.extension

import ru.ravel.rtelebots.TelegramAware

inline fun <T : ru.ravel.rtelebots.request.BaseRequest<T, R>, R : ru.ravel.rtelebots.response.BaseResponse> TelegramAware.execute(
	request: T,
	modifier: T.() -> Unit = {}
): R = execute(request.apply(modifier))