package practice;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("What kind of coffee would you like?");
        System.out.println("Espresso");
        System.out.println("Latte");
        System.out.println("Americano");
        System.out.println("Cappuccino");
        String st= scanner.next().toLowerCase();

        switch (st){
            case ("espresso") -> System.out.println("3 euros from you");
            case ("latte") -> System.out.println("5 euros from you");
            case ("americano") -> System.out.println("2,5 euros from you");
            case ("cappuccino") -> System.out.println("4 euros from you");
            default -> System.out.println("We don't have such a drink! Try once more!");
        }
    }
}
