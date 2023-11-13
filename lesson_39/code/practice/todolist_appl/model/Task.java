package practice.todolist_appl.model;
import java.time.LocalDateTime;
import java.util.Objects;
import practice.todolist_appl.model.Task;

import java.util.Arrays;


public class Task implements Comparable<Task>{
    // fields
    private int id; // идентификатор
    private String task; // содержание задачи
    private static int helpId; //нужен, чтобы id увеличивался на 1
    private LocalDateTime time;

    // constructor
    public Task(String task, LocalDateTime time) {
        this.id = helpId++;
        this.task = task;
        this.time=time;
    } // совпадает с именем класса, ничего не возвращает и не void


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() { //печатаем не id, а номер задачи и задачу
        return  (id+1)+ " : " +task+" | Time of creation: "+time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) {
        return this.id - o.id; // сортировка по id, от меньшего к большему
    }

}
