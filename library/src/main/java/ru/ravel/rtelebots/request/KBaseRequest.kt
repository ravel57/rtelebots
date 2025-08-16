package ru.ravel.rtelebots.request

import kotlin.reflect.KClass

abstract class KBaseRequest<T : _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<T, R>, R : _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(
	clazz: KClass<R>
) : _root_ide_package_.ru.ravel.rtelebots.request.BaseRequest<T, R>(clazz.java) {

	@Suppress("UNCHECKED_CAST", "MemberVisibilityCanBePrivate")
	protected val self by lazy { this as T }

	internal fun addParameter(name: String, value: Any?): T {
		return add(name, value)
	}

	protected fun applySelf(block: T.() -> Unit): T =
		self.apply(block)

}