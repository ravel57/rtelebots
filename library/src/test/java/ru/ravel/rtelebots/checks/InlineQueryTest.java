package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.InlineQuery;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 1/13/16.
 */
public class InlineQueryTest {

	public static void checkQuery(InlineQuery inlineQuery) {
		assertNotNull(inlineQuery.id());
		assertNotNull(inlineQuery.from());
		assertNotNull(inlineQuery.query());
		assertNotNull(inlineQuery.offset());
		UserTest.checkUser(inlineQuery.from());
	}

}
