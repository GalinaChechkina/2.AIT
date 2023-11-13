package practice.todolist_appl.dao;
import practice.todolist_appl.model.Task;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class ToDoListImpl implements ToDoList {

    private Task[] tasks;
    private int capacity;
    private int quantity;
    private LocalDateTime time; //дата и время создания задачи

    // constructor
    public ToDoListImpl(int capacity){
        tasks = new Task[capacity];
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || quantity == tasks.length || findTask(task.getId())!=null) {
            return false;
        }
        tasks[quantity] = task;
        quantity++;
        return true;
    }

    @Override
    public Task findTask(int id) {
        for (int i = 0; i < quantity; i++) {
            if(tasks[i].getId()==id){
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task removeTask(int id) {
        //удаляем элемент, сортируем массив
        for (int i = 0; i < quantity; i++) {
            if(tasks[i].getId()==(id-1)) {
                tasks[i].setId(i+1);
                Task removedTask = tasks[i];
                for (int j = i; j < quantity; j++) {
                    tasks[j].setId(j - 1);
                }
                System.arraycopy(tasks, i+1, tasks, i, quantity - i-1);
                tasks[--quantity] = null;
                return removedTask;
            }
        }
        return null;
    }

    @Override
    public void printTasks() {

        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
        System.out.println();
    }

    @Override
    public int quantity() {
        return quantity;
    }
}
