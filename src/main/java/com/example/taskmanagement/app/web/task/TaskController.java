package com.example.taskmanagement.app.web.task;

import com.example.taskmanagement.domain.model.Task;
import com.example.taskmanagement.domain.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/top")
    public String getTaskList(Model model) {
        List<Task> taskList = taskService.getTaskList();
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
