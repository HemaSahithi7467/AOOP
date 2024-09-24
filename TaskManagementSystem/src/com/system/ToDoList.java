package com.system;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Add task
    public void addTask(String task) {
        tasks.add(task);
    }

    // Update task at given index
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Remove task by index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoList td = new ToDoList();
        td.addTask("Do laundry");
        td.addTask("Call mom");
        td.displayTasks();
        td.updateTask(1, "Call dad");
        td.displayTasks();
        td.removeTask(0);
        td.displayTasks();
    }
}