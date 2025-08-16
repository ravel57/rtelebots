package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.GameHighScore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Stas Parshin
 * 05 June 2017
 */
public class GameHighScoreTest {

	public static void check(GameHighScore... scores) {
		for (int i = 0; i < scores.length; i++) {
			GameHighScore score = scores[i];
			Integer expectedPos = i + 1;
			assertEquals(expectedPos, score.position());
			assertNotNull(score.score());
			UserTest.checkUser(score.user());
		}
	}
}
