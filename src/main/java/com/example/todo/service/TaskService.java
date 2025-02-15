// Оптимизация сервиса задач
package com.example.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.todo.repository.TaskRepository;
import java.util.List;



@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String task) {
        taskRepository.addTask(task);
    }

    public List<String> getAllTasks() {
        return taskRepository.getTasks();
    }
}
