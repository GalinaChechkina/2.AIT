package practice;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Input the first two letters of the day of the week");
        String string= scanner.next();

        switch (string){
            case "Mo" -> System.out.println("Monday");
            case "Tu" -> System.out.println("Tuesday");
            case "We" -> System.out.println("Wednesday");
            case "Th" -> System.out.println("Thursday");
            case "Fr" -> System.out.println("Friday");
            case "Sa" ->System.out.println("Saturday");
            case "Su" -> System.out.println("Sunday");
            default -> System.out.println("Wrong input!");
        }
    }
}
