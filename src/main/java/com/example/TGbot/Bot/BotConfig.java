package com.example.TGbot.Bot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@PropertySource(value = "application.properties")
public class BotConfig {
    @Value("${bot.token}")
    public String botToken;
    @Value("${bot.name}")
    public String botName;
}
