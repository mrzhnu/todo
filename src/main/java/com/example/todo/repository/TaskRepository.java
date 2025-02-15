package com.example.todo.repository;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class TaskRepository {
    private final List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Добавлена задача: " + task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
