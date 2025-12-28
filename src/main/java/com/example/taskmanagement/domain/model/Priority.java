package com.example.taskmanagement.domain.model;

import lombok.Getter;

@Getter
public enum Priority {

    HIGH("高"),
    MEDIUM("中"),
    LOW("低");

    private final String label;

    Priority(String label) {
        this.label = label;
    }

}

