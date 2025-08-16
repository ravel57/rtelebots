package ru.ravel.rtelebots.utility.gson;

import com.google.gson.*;
import ru.ravel.rtelebots.model.chatboost.source.ChatBoostSource;
import ru.ravel.rtelebots.model.chatboost.source.ChatBoostSourceGiftCode;
import ru.ravel.rtelebots.model.chatboost.source.ChatBoostSourceGiveaway;
import ru.ravel.rtelebots.model.chatboost.source.ChatBoostSourcePremium;

import java.lang.reflect.Type;

public class ChatBoostSourceTypeAdapter implements JsonDeserializer<ChatBoostSource> {

	@Override
	public ChatBoostSource deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = element.getAsJsonObject();
		JsonPrimitive primitive = object.getAsJsonPrimitive("source");
		String discriminator = primitive != null ? primitive.getAsString() : "unknown";

		if (ChatBoostSourceGiftCode.CHAT_BOOST_TYPE.equals(discriminator)) {
			return context.deserialize(object, ChatBoostSourceGiftCode.class);
		} else if (ChatBoostSourceGiveaway.CHAT_BOOST_TYPE.equals(discriminator)) {
			return context.deserialize(object, ChatBoostSourceGiveaway.class);
		} else if (ChatBoostSourcePremium.CHAT_BOOST_TYPE.equals(discriminator)) {
			return context.deserialize(object, ChatBoostSourcePremium.class);
		}

		return new ChatBoostSource(discriminator);
	}
}
