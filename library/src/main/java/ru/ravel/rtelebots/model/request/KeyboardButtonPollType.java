package ru.ravel.rtelebots.model.request;

import ru.ravel.rtelebots.model.Poll;

import java.io.Serializable;

/**
 * Stas Parshin
 * 25 January 2020
 */
public class KeyboardButtonPollType implements Serializable {
	private final static long serialVersionUID = 0L;

	private String type;

	public KeyboardButtonPollType() {
	}

	public KeyboardButtonPollType(String type) {
		this.type = type;
	}

	public KeyboardButtonPollType(Poll.Type type) {
		this(type.name());
	}
}
