package ru.ravel.rtelebots.builder;

import ru.ravel.rtelebots.TelegramBot;
import ru.ravel.rtelebots.model.request.InlineKeyboardButton;
import ru.ravel.rtelebots.model.request.InlineKeyboardMarkup;
import ru.ravel.rtelebots.model.request.ParseMode;
import ru.ravel.rtelebots.request.EditMessageText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditMessageBuilder extends MessageBuilder {

	private String text;
	private Integer messageId;
	private ParseMode parseMode;
	private List<InlineKeyboardButton> buttons;
	private Integer keyboardOffset;


	public EditMessageBuilder(TelegramBot bot) {
		super(bot);
	}

	public EditMessageBuilder telegramId(Long telegramId) {
		this.telegramId = telegramId;
		return this;
	}

	public EditMessageBuilder text(String text) {
		this.text = text;
		return this;
	}

	public EditMessageBuilder messageId(Integer messageId) {
		this.messageId = messageId;
		return this;
	}

	public EditMessageBuilder buttons(Integer keyboardOffset, List<InlineKeyboardButton> buttons) {
		this.keyboardOffset = keyboardOffset;
		this.buttons = buttons;
		return this;
	}

	public EditMessageBuilder buttons(Integer keyboardOffset, InlineKeyboardButton... buttons) {
		this.keyboardOffset = keyboardOffset;
		this.buttons = Arrays.asList(buttons);
		return this;
	}

	/**
	 * callbackData = "back"
	 *
	 * @param text button text
	 * @return SendEditMessageBuilder
	 */
	public EditMessageBuilder addBackButton(String text) {
		this.buttons.add(new InlineKeyboardButton(text).callbackData("back"));
		return this;
	}

	public EditMessageBuilder parseMode(ParseMode parseMode) {
		this.parseMode = parseMode;
		return this;
	}

	public void execute() throws NoSuchFieldException {
		if (telegramId == null || text == null || this.messageId == null) {
			throw new NoSuchFieldException();
		}
		EditMessageText message = new EditMessageText(telegramId, this.messageId, text);

		if (buttons != null) {
			InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup();
			List<InlineKeyboardButton> row = new ArrayList<>();
			for (InlineKeyboardButton button : buttons) {
				row.add(button);
				if (row.size() == keyboardOffset) {
					InlineKeyboardButton[] buttonArray = row.toArray(new InlineKeyboardButton[0]);
					inlineKeyboard.addRow(buttonArray);
					row = new ArrayList<>();
				}
			}
			if (!row.isEmpty()) {
				InlineKeyboardButton[] buttonArray = row.toArray(new InlineKeyboardButton[0]);
				inlineKeyboard.addRow(buttonArray);
			}
			message.replyMarkup(inlineKeyboard);
		}
		if (parseMode != null) {
			message.parseMode(parseMode);
		}
		bot.execute(message);
	}
}