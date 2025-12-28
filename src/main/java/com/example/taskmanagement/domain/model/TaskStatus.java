package com.example.taskmanagement.domain.model;

import lombok.Getter;

@Getter
public enum TaskStatus {

    TODO("未着手"),
    DOING("進行中"),
    DONE("完了");

    private final String label;

    TaskStatus(String label) {
        this.label = label;
    }

}
