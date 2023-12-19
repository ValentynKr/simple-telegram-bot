package com.krylovetskyi.simpletelegrambot.utils;

import com.krylovetskyi.simpletelegrambot.service.HelloTelegramBot;
import org.springframework.boot.CommandLineRunner;
import org.telegram.telegrambots.meta.api.methods.updates.SetWebhook;

public class BotInitializer implements CommandLineRunner {

    private final HelloTelegramBot telegramService;

    BotInitializer(HelloTelegramBot telegramService) {
        this.telegramService = telegramService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Set up the Ngrok webhook
        SetWebhook setWebhook = new SetWebhook();
        setWebhook.setUrl("SET ME");

        telegramService.execute(setWebhook);
    }
}

