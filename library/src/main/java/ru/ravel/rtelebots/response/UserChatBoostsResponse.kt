package ru.ravel.rtelebots.response

data class UserChatBoostsResponse(private val result: ChatBoosts = ChatBoosts(emptyList())) :
	_root_ide_package_.ru.ravel.rtelebots.response.BaseResponse() {
	data class ChatBoosts(val boosts: List<_root_ide_package_.ru.ravel.rtelebots.model.chatboost.ChatBoost>)

	fun boosts(): Array<_root_ide_package_.ru.ravel.rtelebots.model.chatboost.ChatBoost> {
		return result.boosts.toTypedArray()
	}
}