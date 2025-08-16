package ru.ravel.rtelebots;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Stas Parshin
 * 29 July 2018
 */
public class AttachName {

	private AttachName() {
	}

	private static final AtomicInteger counter = new AtomicInteger();

	public static String next() {
		return "attach" + counter.incrementAndGet();
	}

	public static void reset() {
		counter.set(0);
	}

}
