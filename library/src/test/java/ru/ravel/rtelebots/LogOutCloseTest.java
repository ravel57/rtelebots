package ru.ravel.rtelebots;

import ru.ravel.rtelebots.request.Close;
import ru.ravel.rtelebots.request.LogOut;
import ru.ravel.rtelebots.response.BaseResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Stas Parshin
 * 05 November 2020
 */
public class LogOutCloseTest {

	@Test
	public void logOut() {
		String logOut = new LogOut().toWebhookResponse();
		assertEquals(logOut, "{\"method\":\"logOut\"}");
	}

	@Test
	public void close() {
		String close = new Close().toWebhookResponse();
		assertEquals(close, "{\"method\":\"close\"}");
	}

}
