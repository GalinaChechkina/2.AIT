package practice;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("What kind of trash did you bring?");
        System.out.println(" plastic, paper, food waste, package, bag, other waste, cartoon");

        String tr= scanner.next();
        switch (tr){
            case "plastic", "package", "bag" -> System.out.println("Put it in to yellow bin!");
            case "waste" -> System.out.println("Put it in to brown bin!");
            case "paper", "" -> System.out.println("Put it in to green bin!");
            case "cartoon" -> System.out.println("Put it in to black bin!");
            default -> System.out.println("Wrong input");
        }
    }
}

