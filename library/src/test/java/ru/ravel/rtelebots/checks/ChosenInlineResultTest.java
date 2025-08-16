package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.ChosenInlineResult;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 1/20/16.
 */
public class ChosenInlineResultTest {

	public static void check(ChosenInlineResult result) {
		assertNotNull(result.resultId());
		assertNotNull(result.query());
		UserTest.checkUser(result.from());
	}

}
