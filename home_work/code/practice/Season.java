package practice;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number from 1 to 12 ");
        int n= scanner.nextInt();

        switch (n) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("I said from 1 to 12");
        }
    }
}
