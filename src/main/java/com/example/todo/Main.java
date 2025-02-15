package com.example.todo;

import com.example.todo.service.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.todo.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        TaskService taskService = context.getBean(TaskService.class);

        taskService.addTask("Купить продукты");
        taskService.addTask("Позвонить другу");

        System.out.println("Все задачи: " + taskService.getAllTasks());

        context.close();
    }
}
