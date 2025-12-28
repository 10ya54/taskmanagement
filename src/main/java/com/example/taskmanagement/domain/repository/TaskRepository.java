package com.example.taskmanagement.domain.repository;

import com.example.taskmanagement.domain.model.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskRepository {

    /**
     * タスク一覧取得
     *
//     * @param userId ユーザーID
     * @return タスク一覧
     */
    List<Task> findByUserId();
}
