package com.example.taskmanagement.domain.model;

import lombok.Getter;


@Getter
public enum TaskStatus {
    TODO("未着手", "bg-secondary"),
    DOING("進行中", "bg-primary"),
    DONE("完了", "bg-success");

    private final String label;
    private final String cssClass;

    TaskStatus(String label, String cssClass) {
        this.label = label;
        this.cssClass = cssClass;
    }

}
