package org.example.services;

import org.example.controller.TelegramBot;
import org.example.dto.RecordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
public class BotService {
    @Value("${chat.id.vlad}")
    private String chatId;
    private final TelegramBot telegramBot;

    @Autowired
    public BotService(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public void sendMessage(RecordDTO recordDTO){
        var resp = new SendMessage();
        resp.setText("К вам на занятия хочет записаться: " + recordDTO.getFio()+
                "\nНомер телефона: " + recordDTO.getPhoneNumber()+
                "\nУдобный способ связи: " + recordDTO.getConnectionType()+
                "\nТариф: " +recordDTO.getRate() + "\nКласс: " +recordDTO.getClassNumber());
        resp.setChatId(chatId);
        telegramBot.sendAnswerMessage(resp);
    }
}
