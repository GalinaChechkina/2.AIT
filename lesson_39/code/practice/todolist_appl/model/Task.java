package practice.todolist_appl.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import practice.todolist_appl.model.Task;

import java.util.Arrays;


public class Task implements Comparable<Task>, Serializable {
    private String task;
    private LocalDate date;

    public Task(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "task: " + task + " data: " + date;
    }
    @Override
    public int compareTo(Task o) {
        return this.date.compareTo(o.date);
    }

}