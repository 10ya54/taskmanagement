package com.example.taskmanagement.domain.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** タイトル */
    private String title;

    /** 説明 */
    private String description;

    /** 期限 */
    private LocalDateTime dueDate;

    /** 種別 */
    @Enumerated(EnumType.STRING)
    private TaskType type;

    /** 優先度 */
    @Enumerated(EnumType.STRING)
    private Priority priority;

    /** 担当者（ユーザID or ユーザ名） */
    private String assignee;

    /** ステータス */
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
}
