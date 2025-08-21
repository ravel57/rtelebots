package ru.ravel.rtelebots

import ru.ravel.rtelebots.model.Update
import ru.ravel.rtelebots.response.SendResponse
import ru.ravel.rtelebots.utility.BotUtils
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.StringReader

/**
 * Stas Parshin
 * 26 January 2020
 */
class BotUtilsTest {
	val updateStr: String = """
         {
           "update_id": 874199391,
           "message": {
             "message_id": 33111,
             "from": {
               "id": 1231231231,
               "is_bot": false,
               "first_name": "RRRR",
               "username": "RRRR54321"
             },
             "chat": {
               "id": -23123123123123,
               "title": "hhh iiiiii ccccc",
               "type": "supergroup"
             },
             "user_shared": {
               "user_id": 6111111111,
               "request_id": 1
             },
             "users_shared": {
               "user_ids": [
                 6111111111
               ],
               "users": [
                 {
                   "user_id": 6111111111,
                   "first_name": "FirstNameTest",
                   "last_name": "LastNameTest"
                 }
               ],
               "request_id": 1
             },
             "date": 1579958705,
             "text": "block the news",
             "giveaway_created": {}
           }
         }
         """.trimIndent()

	private fun check(update: ru.ravel.rtelebots.model.Update) {
		Assert.assertEquals(update.updateId(), 874199391)
		Assert.assertEquals(update.message().messageId(), 33111)
		Assert.assertEquals(update.message().usersShared().users()[0].userId(), 6111111111L)
		Assert.assertEquals(update.message().giveawayCreated().prizeStarCount, 0)
	}

	@Test
	fun parseUpdateString() {
		val update = ru.ravel.rtelebots.utility.BotUtils.parseUpdate(updateStr)
		check(update)
	}

	@Test
	fun parseUpdateReader() {
		val update = ru.ravel.rtelebots.utility.BotUtils.parseUpdate(StringReader(updateStr))
		check(update)
	}

	@Test
	@Throws(IOException::class)
	fun bytesFromInputStream() {
		val src = byteArrayOf(1, 2, 3, 4)
		val bytes = ru.ravel.rtelebots.utility.BotUtils.getBytesFromInputStream(ByteArrayInputStream(src))
		Assert.assertArrayEquals(bytes, src)
	}

	@Test
	fun parseNull() {
		Assert.assertNull(
			ru.ravel.rtelebots.utility.BotUtils.fromJson(
				null,
				ru.ravel.rtelebots.response.SendResponse::class.java
			)
		)
		Assert.assertNull(
			ru.ravel.rtelebots.utility.BotUtils.fromJson(
				"",
				ru.ravel.rtelebots.response.SendResponse::class.java
			)
		)
	}
}