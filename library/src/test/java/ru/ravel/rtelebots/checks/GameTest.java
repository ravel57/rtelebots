package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.*;
import ru.ravel.rtelebots.model.Game;

import static org.junit.Assert.*;

/**
 * Stas Parshin
 * 03 October 2016
 */
public class GameTest {

	public static void check(Game game) {
		assertNotNull(game.title());
		assertNotNull(game.description());
		assertNotNull(game.text());
		assertNotNull(game.textEntities());
		PhotoSizeTest.checkPhotos(game.photo());
		AnimationCheck.check(game.animation());
	}

}
