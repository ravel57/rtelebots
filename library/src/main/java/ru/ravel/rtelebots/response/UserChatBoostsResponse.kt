package ru.ravel.rtelebots.response

data class UserChatBoostsResponse(private val result: ChatBoosts = ChatBoosts(emptyList())) :
	BaseResponse() {
	data class ChatBoosts(val boosts: List<ru.ravel.rtelebots.model.chatboost.ChatBoost>)

	fun boosts(): Array<ru.ravel.rtelebots.model.chatboost.ChatBoost> {
		return result.boosts.toTypedArray()
	}
}