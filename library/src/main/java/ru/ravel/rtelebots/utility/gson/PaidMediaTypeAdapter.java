package ru.ravel.rtelebots.utility.gson;

import com.google.gson.*;
import ru.ravel.rtelebots.model.paidmedia.PaidMedia;
import ru.ravel.rtelebots.model.paidmedia.PaidMediaPhoto;
import ru.ravel.rtelebots.model.paidmedia.PaidMediaPreview;
import ru.ravel.rtelebots.model.paidmedia.PaidMediaVideo;

import java.lang.reflect.Type;

public class PaidMediaTypeAdapter implements JsonDeserializer<PaidMedia> {

	@Override
	public PaidMedia deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = element.getAsJsonObject();
		JsonPrimitive primitive = object.getAsJsonPrimitive("type");
		String discriminator = primitive != null ? primitive.getAsString() : "unknown";

		if (PaidMediaPreview.TYPE.equals(discriminator)) {
			return context.deserialize(object, PaidMediaPreview.class);
		} else if (PaidMediaPhoto.TYPE.equals(discriminator)) {
			return context.deserialize(object, PaidMediaPhoto.class);
		} else if (PaidMediaVideo.TYPE.equals(discriminator)) {
			return context.deserialize(object, PaidMediaVideo.class);
		}

		return new PaidMedia(discriminator);
	}
}
