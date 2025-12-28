package com.example.taskmanagement.domain.model;

import lombok.Getter;

@Getter
public enum TaskType {
    WORK("仕事"),
    HOUSEWORK("家事"),
    PERSONAL("個人"),
    STUDY("勉強"),
    FRIEND("友達"),
    OTHER("その他");

    private final String label;

    TaskType(String label) {
        this.label = label;
    }

}
