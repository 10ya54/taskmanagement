package com.example.taskmanagement.domain.service;

import com.example.taskmanagement.domain.model.Task;
import com.example.taskmanagement.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public List<Task> getTaskList() {
        return taskRepository.findByUserId();
    }
}
