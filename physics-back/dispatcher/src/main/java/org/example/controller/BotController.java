package org.example.controller;

import org.example.dto.RecordDTO;
import org.example.services.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin
public class BotController {
    private final BotService botService;

    @Autowired
    public BotController(BotService botService) {
        this.botService = botService;
    }


    @PostMapping("/sendMessage")
    public void sendMassage(@RequestBody RecordDTO recordDTO){
        botService.sendMessage(recordDTO);
    }
}
