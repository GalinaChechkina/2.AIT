package practice;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name?");
        String name= scanner.next();
        System.out.println("Hello "+name+ "! My name is Alex. Nice to meet you.");
        System.out.println("Do you like coffee? (y/n)");
        String coffee= scanner.next();
        switch (coffee){
            case "y" -> System.out.println("Really? I hate it, because it can kill me!");
            case "n" -> System.out.println("Me too, I prefer whiskey :)");
            default -> System.out.println("I can't accept this answer!");
        }
        System.out.println("How old are you? (number)");
        int age= scanner.nextInt();
        System.out.println("Did you have your BD in 2023? y/n");
        String BD= scanner.next();
        int year;
        switch (BD) {
            case "y":
                year = 2023 - age;
                System.out.println("Means you was born in " + year);
                break;
            case "n":
                year = 2022 - age;
                System.out.println("Means you was born in " + year);
                break;
            default:
                System.out.println("I can't accept this answer!");
                break;
        }
        System.out.println("Thanks for your answers. Sorry, I am tired. Bye!");
    }
}
