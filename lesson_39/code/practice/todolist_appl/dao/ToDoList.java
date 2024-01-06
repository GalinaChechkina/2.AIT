package practice.todolist_appl.dao;
import practice.todolist_appl.model.Task;

import java.util.List;

public interface ToDoList {

    // add Task
    boolean addTask(Task task);
    // remove Task
    Task removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    List<Task> getAllTasks();
    // quantity of tasks
    int quantity();
}
