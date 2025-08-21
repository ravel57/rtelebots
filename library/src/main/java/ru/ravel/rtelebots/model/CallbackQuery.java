package ru.ravel.rtelebots.model;

import ru.ravel.rtelebots.model.message.MaybeInaccessibleMessage;

import java.io.Serializable;
import java.util.Objects;

/**
 * Stas Parshin
 * 07 May 2016
 */
public class CallbackQuery implements Serializable {
	private final static long serialVersionUID = 0L;

	private String id;
	private User from;
	private MaybeInaccessibleMessage message;
	private String inline_message_id;
	private String chat_instance;
	private String data;
	private String game_short_name;

	public String id() {
		return id;
	}

	public User from() {
		return from;
	}

	public MaybeInaccessibleMessage maybeInaccessibleMessage() {
		return message;
	}

	/**
	 * @deprecated Use CallbackQuery#maybeInaccessibleMessage instead
	 */
	@Deprecated
	public Message message() {
		if (message instanceof Message) {
			return (Message) message;
		}

		Message result = new Message();
		result.setChat(message.chat());
		result.setMessageId(message.messageId());
		result.setDate(message.date());

		return result;
	}

	public String inlineMessageId() {
		return inline_message_id;
	}

	public String chatInstance() {
		return chat_instance;
	}

	public String data() {
		return data;
	}

	public String gameShortName() {
		return game_short_name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CallbackQuery that = (CallbackQuery) o;

		if (!Objects.equals(id, that.id)) return false;
		if (!Objects.equals(from, that.from)) return false;
		if (!Objects.equals(message, that.message)) return false;
		if (!Objects.equals(inline_message_id, that.inline_message_id))
			return false;
		if (!Objects.equals(chat_instance, that.chat_instance))
			return false;
		if (!Objects.equals(data, that.data)) return false;
		return Objects.equals(game_short_name, that.game_short_name);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "CallbackQuery{" +
				"id='" + id + '\'' +
				", from=" + from +
				", message=" + message +
				", inline_message_id='" + inline_message_id + '\'' +
				", chat_instance='" + chat_instance + '\'' +
				", data='" + data + '\'' +
				", game_short_name='" + game_short_name + '\'' +
				'}';
	}
}
