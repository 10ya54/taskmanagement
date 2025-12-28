package com.example.taskmanagement.domain.service;

import com.example.taskmanagement.domain.model.Task;
import java.util.List;

public interface TaskService {

    /**
     * タスク一覧取得
     *
//     * @param userId ユーザーID
     * @return タスク一覧
     */
    List<Task> getTaskList();
}
