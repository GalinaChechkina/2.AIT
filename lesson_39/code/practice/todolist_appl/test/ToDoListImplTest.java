package practice.todolist_appl.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.todolist_appl.dao.ToDoListImpl;
import practice.todolist_appl.model.Task;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    ToDoListImpl toDoList;
    Task task;
    Task[]tasks;

    @BeforeEach
    void setUp() {
        toDoList=new ToDoListImpl(6);
        tasks=new Task[5];
        tasks[0]=new Task("Do homework", LocalDateTime.now());
        tasks[1]=new Task("Bay products",LocalDateTime.now());
        tasks[2]=new Task("Pick up the child from school",LocalDateTime.now());
        tasks[3]=new Task("Auto",LocalDateTime.now());
        tasks[4]=new Task("Nails",LocalDateTime.now());
        for (int i = 0; i < tasks.length; i++) {
            toDoList.addTask(tasks[i]);
        }
        toDoList.printTasks();
    }

    @Test
    void addTask() {
        assertFalse(toDoList.addTask(null));
        assertFalse(toDoList.addTask(tasks[0]));
        Task task1=new Task("Meet a friend",LocalDateTime.now());
        assertTrue(toDoList.addTask(task1));
        toDoList.printTasks();
        assertEquals(4,toDoList.quantity());
        Task task2=new Task("Pay a fine",LocalDateTime.now());
        assertFalse(toDoList.addTask(task2));
    }

    @Test
    void removeTask() {
        assertEquals(tasks[1],toDoList.removeTask(1));
        toDoList.printTasks();
        assertEquals(4,toDoList.quantity());
        assertNull(toDoList.removeTask(7));

    }

    @Test
    void findTask(){
        assertEquals(tasks[2],toDoList.findTask(2));
        assertEquals(null,toDoList.findTask(5));
    }

    @Test
    void printTasks() {
        toDoList.printTasks();
    }

    @Test
    void quantity() {
        assertEquals(3,toDoList.quantity());
    }
}