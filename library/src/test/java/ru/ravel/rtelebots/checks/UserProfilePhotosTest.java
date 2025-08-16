package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.PhotoSize;
import ru.ravel.rtelebots.model.UserProfilePhotos;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 10/21/15.
 */
public class UserProfilePhotosTest {

	public static void check(UserProfilePhotos profilePhotos) {
		assertNotNull(profilePhotos.totalCount());
		for (PhotoSize[] photos : profilePhotos.photos()) {
			PhotoSizeTest.checkPhotos(photos);
		}
	}
}
