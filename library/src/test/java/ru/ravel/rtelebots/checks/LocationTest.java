package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.Location;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 10/21/15.
 */
public class LocationTest {


	public static void check(Location location) {
		assertNotNull(location.latitude());
		assertNotNull(location.longitude());
	}
}
