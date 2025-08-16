package ru.ravel.rtelebots.model.story.area.type

@Suppress("unused")
class StoryAreaTypeSuggestedReaction private constructor(
	@get:JvmName("reactionType") val reactionType: _root_ide_package_.ru.ravel.rtelebots.model.reaction.ReactionType,
	@get:JvmName("isDark") var isDark: Boolean?,
	@get:JvmName("isFlipped") var isFlipped: Boolean?
) : StoryAreaType(type = "suggested_reaction") {

	constructor(reactionType: _root_ide_package_.ru.ravel.rtelebots.model.reaction.ReactionType) : this(
		reactionType = reactionType,
		isDark = null,
		isFlipped = null
	)

	fun isDark(isDark: Boolean) = apply {
		this.isDark = isDark
	}

	fun isFlipped(isFlipped: Boolean) = apply {
		this.isFlipped = isFlipped
	}

}
