package practice.todolist_appl.dao;
import practice.todolist_appl.model.Task;

import java.util.Arrays;

public class ToDoListImpl implements ToDoList {

    private Task[] tasks;
    private int capacity;
    private int quantity;

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
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                System.arraycopy(tasks,i+1,tasks,i,quantity-i-1);
                tasks[i].setId(i);
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
