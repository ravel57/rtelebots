package ru.ravel.rtelebots.model;

import java.io.Serializable;

/**
 * Stas Parshin
 * 10 March 2021
 */
public class VideoChatStarted implements Serializable {
	private final static long serialVersionUID = 0L;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		return o != null && getClass() == o.getClass();
	}

	@Override
	public int hashCode() {
		return 1;
	}
}
