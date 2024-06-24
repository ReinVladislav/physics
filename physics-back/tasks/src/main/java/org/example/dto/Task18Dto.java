package org.example.dto;

import lombok.Data;
import org.example.data.Task18;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Task18Dto {

    private String text;

    private boolean answer;

    public Task18Dto(Task18 task18){
        text = task18.getText();
        answer = task18.isAnswer();
    }
}
