package ru.ravel.rtelebots.utility.gson;

import com.google.gson.*;
import ru.ravel.rtelebots.model.Message;
import ru.ravel.rtelebots.model.message.InaccessibleMessage;
import ru.ravel.rtelebots.model.message.MaybeInaccessibleMessage;

import java.lang.reflect.Type;

public class MaybeInaccessibleMessageTypeAdapter implements JsonDeserializer<MaybeInaccessibleMessage> {

	@Override
	public MaybeInaccessibleMessage deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = element.getAsJsonObject();
		JsonPrimitive discriminator = object.getAsJsonPrimitive("date");

		if (discriminator != null && !discriminator.isJsonNull() && discriminator.getAsInt() != InaccessibleMessage.INACCESSIBLE_MESSAGE_DATE) {
			return context.deserialize(object, Message.class);
		} else {
			return context.deserialize(object, InaccessibleMessage.class);
		}
	}
}
