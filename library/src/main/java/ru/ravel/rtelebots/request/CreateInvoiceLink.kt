package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.model.request.LabeledPrice
import ru.ravel.rtelebots.response.StringResponse
import ru.ravel.rtelebots.utility.kotlin.optionalRequestParameter
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class CreateInvoiceLink(
	title: String,
	description: String,
	payload: String,
	currency: String,
	vararg prices: _root_ide_package_.ru.ravel.rtelebots.model.request.LabeledPrice
) : KBaseRequest<CreateInvoiceLink, _root_ide_package_.ru.ravel.rtelebots.response.StringResponse>(_root_ide_package_.ru.ravel.rtelebots.response.StringResponse::class) {

	val title: String by requestParameter(title)
	val description: String by requestParameter(description)
	val payload: String by requestParameter(payload)
	val currency: String by requestParameter(currency)
	val prices: Array<_root_ide_package_.ru.ravel.rtelebots.model.request.LabeledPrice> by requestParameter(arrayOf(*prices))

	var providerToken: String? by optionalRequestParameter()
	var subscriptionPeriod: Int? by optionalRequestParameter()
	var businessConnectionId: String? by optionalRequestParameter()
	var maxTipAmount: Int? by optionalRequestParameter()
	var suggestedTipAmounts: Array<Int>? by optionalRequestParameter()
	var providerData: String? by optionalRequestParameter()
	var photoUrl: String? by optionalRequestParameter()
	var photoSize: Int? by optionalRequestParameter()
	var photoWidth: Int? by optionalRequestParameter()
	var photoHeight: Int? by optionalRequestParameter()
	var needName: Boolean? by optionalRequestParameter()
	var needPhoneNumber: Boolean? by optionalRequestParameter()
	var needEmail: Boolean? by optionalRequestParameter()
	var needShippingAddress: Boolean? by optionalRequestParameter()
	var sendEmailToProvider: Boolean? by optionalRequestParameter()
	var sendPhoneNumberToProvider: Boolean? by optionalRequestParameter()
	var isFlexible: Boolean? by optionalRequestParameter()

	fun providerToken(providerToken: String) = apply { this.providerToken = providerToken }

	fun subscriptionPeriod(subscriptionPeriod: Int) = apply { this.subscriptionPeriod = subscriptionPeriod }

	fun businessConnectionId(businessConnectionId: String) = apply { this.businessConnectionId = businessConnectionId }

	fun maxTipAmount(maxTipAmount: Int) = apply { this.maxTipAmount = maxTipAmount }

	fun suggestedTipAmounts(suggestedTipAmounts: Array<Int>) = apply { this.suggestedTipAmounts = suggestedTipAmounts }

	fun providerData(providerData: String) = apply { this.providerData = providerData }

	fun photoUrl(photoUrl: String) = apply { this.photoUrl = photoUrl }

	fun photoSize(photoSize: Int) = apply { this.photoSize = photoSize }

	fun photoWidth(photoWidth: Int) = apply { this.photoWidth = photoWidth }

	fun photoHeight(photoHeight: Int) = apply { this.photoHeight = photoHeight }

	fun needName(needName: Boolean) = apply { this.needName = needName }

	fun needPhoneNumber(needPhoneNumber: Boolean) = apply { this.needPhoneNumber = needPhoneNumber }

	fun needEmail(needEmail: Boolean) = apply { this.needEmail = needEmail }

	fun needShippingAddress(needShippingAddress: Boolean) = apply { this.needShippingAddress = needShippingAddress }

	fun sendEmailToProvider(sendEmailToProvider: Boolean) = apply { this.sendEmailToProvider = sendEmailToProvider }

	fun sendPhoneNumberToProvider(sendPhoneNumberToProvider: Boolean) =
		apply { this.sendPhoneNumberToProvider = sendPhoneNumberToProvider }

	fun isFlexible(isFlexible: Boolean) = apply { this.isFlexible = isFlexible }

}