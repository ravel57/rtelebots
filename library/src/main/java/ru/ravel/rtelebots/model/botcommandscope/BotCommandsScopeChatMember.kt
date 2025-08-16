package ru.ravel.rtelebots.model.botcommandscope

class BotCommandsScopeChatMember(val chatId: Any, val userId: Long) : BotCommandScope(type = "chat_member")