package ru.ravel.rtelebots.response

import ru.ravel.rtelebots.model.PreparedInlineMessage

data class SavePreparedInlineMessageResponse(
	val result: PreparedInlineMessage
) : BaseResponse()