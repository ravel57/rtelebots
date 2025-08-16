package ru.ravel.rtelebots

import ru.ravel.rtelebots.model.*
import ru.ravel.rtelebots.model.botcommandscope.BotCommandScope
import ru.ravel.rtelebots.model.chatbackground.BackgroundTypeWallpaper
import ru.ravel.rtelebots.model.message.MaybeInaccessibleMessage
import ru.ravel.rtelebots.model.request.InlineKeyboardButton
import ru.ravel.rtelebots.model.request.InlineKeyboardMarkup
import ru.ravel.rtelebots.model.request.ParseMode
import ru.ravel.rtelebots.passport.Credentials
import ru.ravel.rtelebots.passport.decrypt.Decrypt
import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import sun.misc.Unsafe
import java.lang.reflect.Modifier
import java.util.*

/**
 * Stas Parshin
 * 31 May 2017
 */
class ModelTest {

	private var classes = mutableSetOf<Class<*>>()
	private val customInstance = mutableMapOf<Class<*>, () -> Any>()

	@Before
	fun setClasses() {
		val modelPackage = _root_ide_package_.ru.ravel.rtelebots.model.Animation::class.java.getPackage().name
		val passportPackage = _root_ide_package_.ru.ravel.rtelebots.passport.Credentials::class.java.getPackage().name
		val packages = listOf(modelPackage, passportPackage)
		val excludedPackages = listOf(
			_root_ide_package_.ru.ravel.rtelebots.model.request.ParseMode::class,
			BotCommandScope::class,
			_root_ide_package_.ru.ravel.rtelebots.passport.decrypt.Decrypt::class
		).map { it.java.`package`.name }

		classes.addAll(Reflections(packages, SubTypesScanner(false))
			.getSubTypesOf(Any::class.java)
			.filter {
				!excludedPackages.contains(it.getPackage().name)
						&& !it.simpleName.startsWith("PassportElementError")
						&& !Modifier.isAbstract(it.modifiers)
						&& it.kotlin.objectInstance == null
			})

		// classes from model/request available in responses
		classes.add(_root_ide_package_.ru.ravel.rtelebots.model.request.InlineKeyboardMarkup::class.java)
		classes.add(InlineKeyboardButton::class.java)

		customInstance[_root_ide_package_.ru.ravel.rtelebots.model.chatbackground.BackgroundTypeWallpaper::class.java] = {
			_root_ide_package_.ru.ravel.rtelebots.model.chatbackground.BackgroundTypeWallpaper(
				_root_ide_package_.ru.ravel.rtelebots.model.Document(),
				1
			)
		}
	}

	@Test
	@Throws(ReflectiveOperationException::class)
	fun testEquals() {
		val prefabs = listOf<Any>(
			_root_ide_package_.ru.ravel.rtelebots.model.CallbackQuery().apply {
				javaClass.getDeclaredField("id").apply { isAccessible = true }.set(this, "2")
			},
			_root_ide_package_.ru.ravel.rtelebots.model.Message().apply {
				_root_ide_package_.ru.ravel.rtelebots.model.message.MaybeInaccessibleMessage::class.java.getDeclaredField("message_id")
					.apply { isAccessible = true }
					.set(this, 11)
			},
			_root_ide_package_.ru.ravel.rtelebots.model.Update().apply {
				javaClass.getDeclaredField("update_id").apply { isAccessible = true }.set(this, 1)
			},
			_root_ide_package_.ru.ravel.rtelebots.model.Chat().apply {
				javaClass.getDeclaredField("id").apply { isAccessible = true }.set(this, 1L)
			}
		)

		for (c in classes) {
			val verifierApi = EqualsVerifier.forClass(c)
				.usingGetClass()
				.suppress(Warning.STRICT_HASHCODE)
				.suppress(Warning.NONFINAL_FIELDS)

			prefabs.forEach {
				verifierApi.withPrefabValues(it.javaClass, it.javaClass.getDeclaredConstructor().newInstance(), it)
			}

			if (c == _root_ide_package_.ru.ravel.rtelebots.model.Message::class.java) {
				verifierApi.withIgnoredFields("video_chat_started")
				verifierApi.withIgnoredFields("forum_topic_closed")
				verifierApi.withIgnoredFields("forum_topic_reopened")
				verifierApi.withIgnoredFields("general_forum_topic_hidden")
				verifierApi.withIgnoredFields("general_forum_topic_unhidden")
			}

			verifierApi.verify()
		}
	}

	@Test
	@Throws(Exception::class)
	fun testToString() {
		for (c in classes) {
			val instance = customInstance[c]?.invoke() ?: defaultInstance(c)
			val toString = instance.toString()
			for (f in c.declaredFields) {
				if (Modifier.isStatic(f.modifiers)) {
					continue
				}
				Assert.assertTrue(c.simpleName + " toString doesn't contain " + f.name, toString.contains(f.name))
			}
		}
	}

	private fun <R> defaultInstance(c: Class<R>): R {
		try {
			return c.getDeclaredConstructor().apply { isAccessible = true }.newInstance()
		} catch (e: Exception) {
			val unsafeClass = Class.forName("sun.misc.Unsafe")
			val unsafe = unsafeClass.getDeclaredField("theUnsafe").apply { isAccessible = true }.get(null) as Unsafe
			@Suppress("UNCHECKED_CAST")
			return unsafe.allocateInstance(c) as R
		}
	}
}
