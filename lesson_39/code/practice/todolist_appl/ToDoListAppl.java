package practice.todolist_appl;
import java.time.LocalDateTime;
import java.util.Scanner;
import practice.todolist_appl.dao.ToDoListImpl;
import practice.todolist_appl.model.Menu;
import practice.todolist_appl.model.Task;

public class ToDoListAppl {
    public static void main(String[] args) {

        System.out.println("Welcome to ToDoList Application!");
        ToDoListImpl toDoList = new ToDoListImpl(10);

        while (true) {

            Menu.printMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1: {
                        scanner.nextLine();
                        System.out.println("Input task: ");
                        String task = scanner.nextLine();
                        Task newTask = new Task(task, LocalDateTime.now());
                        toDoList.addTask(newTask);
                        break;
                    }
                    case 2: {
                        System.out.println("Your tasks: ");
                        toDoList.printTasks();
                        break;
                    }
                    case 3: {
                        System.out.println("Input the number of the task you would like to delete: ");
                        int id = scanner.nextInt();
                        Task removedTask = toDoList.removeTask(id );
                        System.out.println(removedTask + " is removed.");
                        break;
                    }
                    case 4:
                        return;
                    default: {
                        System.out.println("Wrong input.");
                    }
                }
            }catch (Exception e){
                System.out.println("Input numbers only!  "+e.toString());
            }
        }
    }
}
