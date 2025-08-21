package ru.ravel.rtelebots

import com.google.gson.JsonDeserializer
import ru.ravel.rtelebots.utility.BotUtils.GSON
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.reflections.Reflections
import java.lang.reflect.ParameterizedType


class GsonAdaptersTest {

	@Test
	fun `all adapters fallback to base class`() {
		val reflections = Reflections(ru.ravel.rtelebots.TelegramBot::class.java.getPackage().name)
		val adapters = reflections.getSubTypesOf(JsonDeserializer::class.java)
		val types = adapters.map { (it.genericInterfaces[0] as ParameterizedType).actualTypeArguments[0] }
		types.forEach {
			assertNotNull(it.typeName, GSON.fromJson("{}", it))
		}
	}

}