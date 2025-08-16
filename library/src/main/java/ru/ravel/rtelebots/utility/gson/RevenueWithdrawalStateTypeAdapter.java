package ru.ravel.rtelebots.utility.gson;

import com.google.gson.*;
import ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalState;
import ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalStateFailed;
import ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalStatePending;
import ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalStateSucceeded;

import java.lang.reflect.Type;

public class RevenueWithdrawalStateTypeAdapter implements JsonDeserializer<RevenueWithdrawalState> {

	@Override
	public RevenueWithdrawalState deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
		JsonObject object = element.getAsJsonObject();
		JsonPrimitive primitive = object.getAsJsonPrimitive("type");
		String discriminator = primitive != null ? primitive.getAsString() : "unknown";

		if (RevenueWithdrawalStatePending.TYPE.equals(discriminator)) {
			return context.deserialize(object, RevenueWithdrawalStatePending.class);
		} else if (RevenueWithdrawalStateSucceeded.TYPE.equals(discriminator)) {
			return context.deserialize(object, RevenueWithdrawalStateSucceeded.class);
		} else if (RevenueWithdrawalStateFailed.TYPE.equals(discriminator)) {
			return context.deserialize(object, RevenueWithdrawalStateFailed.class);
		}

		return new RevenueWithdrawalState(discriminator);
	}
}
