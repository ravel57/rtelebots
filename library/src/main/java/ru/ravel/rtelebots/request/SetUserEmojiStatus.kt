package ru.ravel.rtelebots.request

import ru.ravel.rtelebots.response.BaseResponse
import ru.ravel.rtelebots.utility.kotlin.requestParameter

class SetUserEmojiStatus(
	userId: Long,
	emojiStatusCustomEmojiId: String,
	emojiStatusExpirationDate: Int
) : KBaseRequest<SetUserEmojiStatus, _root_ide_package_.ru.ravel.rtelebots.response.BaseResponse>(_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse::class) {

	val userId: Long by requestParameter(userId)
	val emojiStatusCustomEmojiId: String by requestParameter(emojiStatusCustomEmojiId)
	val emojiStatusExpirationDate: Int by requestParameter(emojiStatusExpirationDate)

}