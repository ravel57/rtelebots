package ru.ravel.rtelebots.utility;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.ravel.rtelebots.model.Update;
import ru.ravel.rtelebots.model.chatbackground.BackgroundFill;
import ru.ravel.rtelebots.model.chatbackground.BackgroundType;
import ru.ravel.rtelebots.model.chatboost.source.ChatBoostSource;
import ru.ravel.rtelebots.model.gift.owned.OwnedGift;
import ru.ravel.rtelebots.model.message.MaybeInaccessibleMessage;
import ru.ravel.rtelebots.model.message.origin.MessageOrigin;
import ru.ravel.rtelebots.model.paidmedia.PaidMedia;
import ru.ravel.rtelebots.model.reaction.ReactionType;
import ru.ravel.rtelebots.model.stars.partner.TransactionPartner;
import ru.ravel.rtelebots.model.stars.withdrawal.RevenueWithdrawalState;
import ru.ravel.rtelebots.utility.gson.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * stas
 * 11/1/15.
 */
public class BotUtils {

	private BotUtils() {
	}

	public static final Gson GSON = new GsonBuilder()
			.registerTypeAdapter(ReactionType.class, new ReactionTypeAdapter())
			.registerTypeAdapter(MessageOrigin.class, new MessageOriginTypeAdapter())
			.registerTypeAdapter(ChatBoostSource.class, new ChatBoostSourceTypeAdapter())
			.registerTypeAdapter(MaybeInaccessibleMessage.class, new MaybeInaccessibleMessageTypeAdapter())
			.registerTypeAdapter(BackgroundType.class, new BackgroundTypeAdapter())
			.registerTypeAdapter(BackgroundFill.class, new BackgroundFillAdapter())
			.registerTypeAdapter(RevenueWithdrawalState.class, new RevenueWithdrawalStateTypeAdapter())
			.registerTypeAdapter(TransactionPartner.class, TransactionPartnerTypeAdapter.INSTANCE)
			.registerTypeAdapter(PaidMedia.class, new PaidMediaTypeAdapter())
			.registerTypeAdapter(OwnedGift.class, new OwnedGiftTypeAdapter())
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.create();

	public static Update parseUpdate(String update) {
		return GSON.fromJson(update, Update.class);
	}

	public static Update parseUpdate(Reader reader) {
		return GSON.fromJson(reader, Update.class);
	}

	public static byte[] getBytesFromInputStream(InputStream is) throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		byte[] buffer = new byte[0xFFFF];
		for (int len = is.read(buffer); len != -1; len = is.read(buffer)) {
			os.write(buffer, 0, len);
		}
		return os.toByteArray();
	}

	public static <R> R fromJson(String jsonString, Class<R> resClass) {
		return GSON.fromJson(jsonString, resClass);
	}

	public static String toJson(Object obj) {
		return GSON.toJson(obj);
	}
}
