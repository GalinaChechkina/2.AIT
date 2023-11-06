package practice.todolist_appl.dao;
import practice.todolist_appl.model.Task;

public interface ToDoList {

    // add Task
    boolean addTask(Task task);

    //find Task
    Task findTask(int id);

    // remove Task
    Task removeTask(int id);

    // show list of Tasks
    void printTasks();

    // quantity of tasks
    int quantity();
}
