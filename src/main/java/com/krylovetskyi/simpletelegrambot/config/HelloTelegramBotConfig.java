package com.krylovetskyi.simpletelegrambot.config;

import com.krylovetskyi.simpletelegrambot.service.HelloTelegramBot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class HelloTelegramBotConfig {

    private final HelloTelegramBot helloTelegramBot;

    HelloTelegramBotConfig(HelloTelegramBot helloTelegramBot) {
        this.helloTelegramBot = helloTelegramBot;
    }

    @Bean
    public TelegramBotsApi telegramBotsApi() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(helloTelegramBot);
        return telegramBotsApi;
    }
}