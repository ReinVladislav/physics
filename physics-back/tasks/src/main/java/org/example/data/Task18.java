package org.example.data;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import org.example.dto.Task18Dto;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Entity
@Table(name = "task18")
public class Task18 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "text")
    private String text;
    @Column(name = "answer")
    private boolean answer;

    public Task18() {

    }

    public Task18(Task18Dto task18Dto){
        text = task18Dto.getText();
        answer = task18Dto.isAnswer();
    }
}
