package com.example.TGbot.Bot;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
@Component
public class Bot extends TelegramLongPollingBot {
    private final BotConfig botConfig;
    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()){
            execute(SendMessage.builder().chatId(update.getMessage().getChatId()).text("hello").build());
        }
    }

    @Override
    public String getBotUsername() {
        return botConfig.botName;
    }
    public Bot(BotConfig botConfig) {
        super(botConfig.botToken);
        this.botConfig = botConfig;
    }
}
