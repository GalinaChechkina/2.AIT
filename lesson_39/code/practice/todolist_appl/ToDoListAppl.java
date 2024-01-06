package practice.todolist_appl;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import practice.employee_save_read.Employee;
import practice.todolist_appl.dao.ToDoListImpl;
import practice.todolist_appl.model.Menu;
import practice.todolist_appl.model.Task;

public class ToDoListAppl implements Serializable{
    public static void main(String[] args) {

        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();


        while (true) {

            Menu.printMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    LocalDate now = LocalDate.now();
                    Task newTask = new Task(task, now);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if(!(removedTask == null)){
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    List<Task> tasks = toDoList.getAllTasks(); //передали в лист tasks наши задачи, которые мы хотим записать в файл
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/todolist.dat"))) {
                        oos.writeObject(tasks);
                        System.out.println("Список задач записан в файл");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5:{
                    System.out.println("Loading... ");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/todolist.dat"))) {
                        List<Task> readTasks = (List<Task>) ois.readObject(); //в лист сложили все, что прочитали из файла
                        System.out.println("Прочитанный список: " + readTasks);
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}

