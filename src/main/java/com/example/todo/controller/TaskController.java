package com.example.todo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.todo.service.TaskService;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void addTask(@RequestParam String task) {
        taskService.addTask(task);
    }

    @GetMapping
    public List<String> getTasks() {
        return taskService.getAllTasks();
    }
}
