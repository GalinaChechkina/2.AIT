package practice.coffee;

import java.util.Scanner;

public class CofeeAppl {
    public static void main(String[] args) {

        System.out.println("Welcome to coffee shop!");
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getType());
        }

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                case 2:
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                case 3:
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                case 4:
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                case 5:
                    System.out.println("Thank you");
                    return;

            default:
                    System.out.println("Wrong choice!");
                    System.exit(0);
                    break;
            }
        }
    }
}
