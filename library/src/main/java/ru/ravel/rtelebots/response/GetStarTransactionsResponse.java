package ru.ravel.rtelebots.response;

import ru.ravel.rtelebots.model.stars.StarTransactions;

import java.util.Objects;

public class GetStarTransactionsResponse extends BaseResponse {

	private StarTransactions result;

	public StarTransactions result() {
		return result;
	}

	@Override
	public String toString() {
		return "GetStarTransactionsResponse{" +
				"result=" + Objects.toString(result) +
				'}';
	}
}
