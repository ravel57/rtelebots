package ru.ravel.rtelebots.checks;

import ru.ravel.rtelebots.model.Document;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 10/21/15.
 */
public class DocumentTest {

	public static void check(Document document) {
		check(document, true);
	}

	public static void check(Document document, boolean checkSize) {
		assertNotNull(document.fileId());
		assertNotNull(document.fileUniqueId());
		assertNotNull(document.fileName());
		assertNotNull(document.mimeType());
		if (checkSize) assertNotNull(document.fileSize());
	}

}
