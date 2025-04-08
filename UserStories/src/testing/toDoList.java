package testing;

import java.util.ArrayList;
import java.util.List;

// ToDoList class to manage a list of Task objects
public class toDoList {

    // List to store tasks
    private List<Task> tasks;

    // Constructor: initializes an empty task list
    public toDoList() {
        tasks = new ArrayList<>();
    }

    // Adds a new task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Returns the list of tasks
    public List<Task> getTasks() {
        return tasks;
    }
}
