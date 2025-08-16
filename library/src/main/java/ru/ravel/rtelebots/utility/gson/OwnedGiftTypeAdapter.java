package ru.ravel.rtelebots.utility.gson;

import com.google.gson.*;
import ru.ravel.rtelebots.model.gift.owned.OwnedGift;
import ru.ravel.rtelebots.model.gift.owned.OwnedGiftRegular;
import ru.ravel.rtelebots.model.gift.owned.OwnedGiftUnique;

import java.lang.reflect.Type;

public class OwnedGiftTypeAdapter implements JsonDeserializer<OwnedGift> {

	@Override
	public OwnedGift deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = element.getAsJsonObject();
		JsonPrimitive primitive = object.getAsJsonPrimitive("type");
		String discriminator = primitive != null ? primitive.getAsString() : "unknown";

		if (OwnedGiftRegular.TYPE.equals(discriminator)) {
			return context.deserialize(object, OwnedGiftRegular.class);
		} else if (OwnedGiftUnique.TYPE.equals(discriminator)) {
			return context.deserialize(object, OwnedGiftUnique.class);
		}

		return new OwnedGift(discriminator);
	}
}
