package ru.ravel.rtelebots;

import ru.ravel.rtelebots.annotation.ContentType
import ru.ravel.rtelebots.annotation.InlineMessageHandler
import ru.ravel.rtelebots.annotation.MessageHandler
import ru.ravel.rtelebots.model.*
import ru.ravel.rtelebots.model.paidmedia.PaidMedia
import ru.ravel.rtelebots.request.BaseRequest
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible


abstract class AnnotatedUpdatesListener(
	private val telegramBot: TelegramBot,
//	scenario: Class<out Scenario>? = null,
) : UpdatesListener {

//	constructor(telegramBot: TelegramBot) : this(telegramBot, null)


	init {
		this::class.declaredFunctions
			.asSequence()
			.map { it.findAnnotations<MessageHandler>() }
			.filter { it.isNotEmpty() }
			.mapNotNull { it.firstOrNull() }
			.filter { it.contentType != ContentType.TEXT }
			.groupBy { it.contentType }
			.filter { it.value.size > 1 }
			.onEach { throw RuntimeException("There should be only one annotation with the type \"${it.value.first().contentType}\"") }
	}


	abstract fun onUpdate(update: Update)

	abstract fun onUpdateAfterAnnotatedMethods(update: Update)


	final override fun process(updates: MutableList<Update>?): Int {
		updates?.forEach { update ->
			var isAnyChange = false
			onUpdate(update)
			if (update.message() != null || update.inlineQuery() != null) {
				this::class.declaredFunctions.forEach { method ->
					method.isAccessible = true
					val messageHandlerAnnotation = method.findAnnotation<MessageHandler>()
					val inlineMessageHandlerAnnotation = method.findAnnotation<InlineMessageHandler>()
					if (messageHandlerAnnotation != null && update.message() != null) {
						when (messageHandlerAnnotation.contentType) {
							ContentType.TEXT -> {
								val text = update.message()?.text()
								if (text != null && (messageHandlerAnnotation.ignoreValue || messageHandlerAnnotation.value == text)) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.AUDIO -> {
								if (update.message()?.voice() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.DOCUMENT -> {
								if (update.message()?.document() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PHOTO -> {
								if (update.message()?.photo() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.STICKER -> {
								if (update.message()?.sticker() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO -> {
								if (update.message()?.video() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VOICE -> {
								if (update.message()?.voice() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.ANIMATION -> {
								if (update.message()?.animation() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PAID_MEDIA -> {
								if (update.message()?.paidMedia() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.LOCATION -> {
								if (update.message()?.location() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.ANY -> {
								isAnyChange = callHandler(method, update)
							}

							ContentType.STORY -> {
								if (update.message()?.story() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO_NOTE -> {
								if (update.message()?.videoNote() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CHECKLIST -> {
								TODO()
							}

							ContentType.CONTACT -> {
								if (update.message()?.contact() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.DICE -> {
								if (update.message()?.dice() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GAME -> {
								if (update.message()?.game() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.POLL -> {
								if (update.message()?.poll() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VENUE -> {
								if (update.message()?.venue() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.NEW_CHAT_MEMBERS -> {
								if (update.message()?.newChatMembers() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.LEFT_CHAT_MEMBER -> {
								if (update.message()?.leftChatMember() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.NEW_CHAT_TITLE -> {
								if (update.message()?.newChatTitle() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.NEW_CHAT_PHOTO -> {
								if (update.message()?.newChatPhoto() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.DELETE_CHAT_PHOTO -> {
								if (update.message()?.deleteChatPhoto() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GROUP_CHAT_CREATED -> {
								if (update.message()?.groupChatCreated() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.SUPERGROUP_CHAT_CREATED -> {
								if (update.message()?.supergroupChatCreated() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CHANNEL_CHAT_CREATED -> {
								if (update.message()?.channelChatCreated() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.MESSAGE_AUTO_DELETE_TIMER_CHANGED -> {
								if (update.message()?.messageAutoDeleteTimerChanged() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.MIGRATE_TO_CHAT_ID -> {
								if (update.message()?.migrateToChatId() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.MIGRATE_FROM_CHAT_ID -> {
								if (update.message()?.migrateFromChatId() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PINNED_MESSAGE -> {
								if (update.message()?.pinnedMessage() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.INVOICE -> {
								if (update.message()?.invoice() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.SUCCESSFUL_PAYMENT -> {
								if (update.message()?.successfulPayment() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.REFUNDED_PAYMENT -> {
								if (update.message()?.refundedPayment() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.USERS_SHARED -> {
								if (update.message()?.usersShared() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CHAT_SHARED -> {
								if (update.message()?.chatShared() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GIFT -> {
								if (update.message()?.gift() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.UNIQUE_GIFT -> {
								if (update.message()?.uniqueGift() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CONNECTED_WEBSITE -> {
								if (update.message()?.connectedWebsite() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.WRITE_ACCESS_ALLOWED -> {
								if (update.message()?.writeAccessAllowed() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PASSPORT_DATA -> {
								if (update.message()?.passportData() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PROXIMITY_ALERT_TRIGGERED -> {
								if (update.message()?.proximityAlertTriggered() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.BOOST_ADDED -> {
								if (update.message()?.boostAdded() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CHAT_BACKGROUND_SET -> {
								if (update.message()?.chatBackgroundSet() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.CHECKLIST_TASKS_DONE -> {
								TODO()
							}

							ContentType.CHECKLIST_TASKS_ADDED -> {
								TODO()
							}

							ContentType.DIRECT_MESSAGE_PRICE_CHANGED -> {
								TODO()
							}

							ContentType.FORUM_TOPIC_CREATED -> {
								if (update.message()?.forumTopicCreated() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.FORUM_TOPIC_EDITED -> {
								if (update.message()?.forumTopicEdited() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.FORUM_TOPIC_CLOSED -> {
								if (update.message()?.forumTopicClosed() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.FORUM_TOPIC_REOPENED -> {
								if (update.message()?.forumTopicReopened() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GENERAL_FORUM_TOPIC_HIDDEN -> {
								if (update.message()?.generalForumTopicHidden() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GENERAL_FORUM_TOPIC_UNHIDDEN -> {
								if (update.message()?.generalForumTopicUnhidden() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GIVEAWAY_CREATED -> {
								if (update.message()?.giveawayCreated() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GIVEAWAY -> {
								if (update.message()?.giveaway() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GIVEAWAY_WINNERS -> {
								if (update.message()?.giveawayWinners() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.GIVEAWAY_COMPLETED -> {
								if (update.message()?.giveawayCompleted() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.PAID_MESSAGE_PRICE_CHANGED -> {
								if (update.message()?.paidMessagePriceChanged() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO_CHAT_SCHEDULED -> {
								if (update.message()?.videoChatScheduled() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO_CHAT_STARTED -> {
								if (update.message()?.videoChatStarted() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO_CHAT_ENDED -> {
								if (update.message()?.videoChatEnded() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.VIDEO_CHAT_PARTICIPANTS_INVITED -> {
								if (update.message()?.videoChatParticipantsInvited() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.WEB_APP_DATA -> {
								if (update.message()?.webAppData() != null) {
									isAnyChange = callHandler(method, update)
								}
							}

							ContentType.USER_SHARED -> {
								TODO()
							}
						}
					} else if (update.inlineQuery() != null && inlineMessageHandlerAnnotation != null) {
						if (inlineMessageHandlerAnnotation.value == update.inlineQuery()?.query()
							|| inlineMessageHandlerAnnotation.ignoreInput
						) {
							isAnyChange = callHandler(method, update)
						}
					}
				}
			}
			if (!isAnyChange) {
				onUpdateAfterAnnotatedMethods(update)
			}
		}
		return UpdatesListener.CONFIRMED_UPDATES_ALL
	}


	private fun processCommand(method: KFunction<*>, update: Update) {
		val args = method.parameters
			.map { param ->
				val classifier = param.type.classifier as? KClass<*>
				when {
					classifier?.isSubclassOf(Message::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Audio::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(PhotoSize::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Sticker::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Video::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Voice::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Animation::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(PaidMedia::class) == true -> update.message() ?: return
					classifier?.isSubclassOf(Location::class) == true -> update.message() ?: return

					classifier?.isSubclassOf(InlineQuery::class) == true -> update.inlineQuery() ?: return
					else -> this
				}
			}
		val result = method.call(*args.toTypedArray())
		if (result is BaseRequest<*, *>) {
			telegramBot.execute(BaseRequest::class.cast(result))
		}
	}


	private fun callHandler(method: KFunction<*>, update: Update): Boolean {
		processCommand(method, update)
		return true
	}

}
