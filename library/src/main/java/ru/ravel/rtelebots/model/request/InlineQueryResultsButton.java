package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.model.WebAppInfo;

import java.io.Serializable;

public class InlineQueryResultsButton implements Serializable {

	private final static long serialVersionUID = 0L;

	private final String text;
	private WebAppInfo web_app;
	private String start_parameter;

	public InlineQueryResultsButton(String text, WebAppInfo webApp) {
		this.text = text;
		this.web_app = webApp;
	}

	public InlineQueryResultsButton(String text, String startParameter) {
		this.text = text;
		this.start_parameter = startParameter;
	}

	public String text() {
		return text;
	}

	public WebAppInfo webApp() {
		return web_app;
	}

	public String startParameter() {
		return start_parameter;
	}

}
