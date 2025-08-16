package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.BaseResponse;


public class RefundStarPayment extends BaseRequest<RefundStarPayment, BaseResponse> {

	public RefundStarPayment(Long userId, String telegramPaymentChargeId) {
		super(BaseResponse.class);
		add("user_id", userId).add("telegram_payment_charge_id", telegramPaymentChargeId);
	}

}
