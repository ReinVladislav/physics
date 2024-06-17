package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RecordDTO {
    private String fio;
    private String phoneNumber;
    private String connectionType;
    private String rate;
    private int classNumber;
}
