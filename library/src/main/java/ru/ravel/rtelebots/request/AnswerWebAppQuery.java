package ru.ravel.rtelebots.request;

import ru.ravel.rtelebots.model.request.InlineQueryResult;
import ru.ravel.rtelebots.response.BaseResponse;
import ru.ravel.rtelebots.response.SentWebAppMessageResponse;
import ru.ravel.rtelebots.response.SentWebAppMessageResponse;

/**
 * Mirco Ianese
 * 20 Apr 2022
 */
public class AnswerWebAppQuery extends BaseRequest<AnswerWebAppQuery, SentWebAppMessageResponse> {

	public AnswerWebAppQuery(String web_app_query_id, InlineQueryResult<?> result) {
		super(SentWebAppMessageResponse.class);
		add("web_app_query_id", web_app_query_id).add("result", result);
	}


}
