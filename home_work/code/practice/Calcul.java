package practice;

import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {

        int n1;
        int n2;
        int action;
        int res;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st integer");
        n1 = scanner.nextInt();
        System.out.println("Input 2nd integer");
        n2 = scanner.nextInt();
        System.out.println("Choose a number from 1 to 5");
        System.out.println(" 1 is '+'");
        System.out.println(" 2 is '-'");
        System.out.println(" 3 is '*'");
        System.out.println(" 4 is '/'");
        System.out.println(" 5 is '%'");
        action = scanner.nextInt();

        switch (action) {
            case 1:
                res = n1 + n2;
                System.out.println("Sum n1 and n2 is " + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("Difference n1 and n2 is " + res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println("Product " +n1+ " and " +n2+ " is " + res);
                break;
            case 4:

                if (n2==0){
                    System.out.println("You can't divide by zero!");
                } else {
                    res = n1 / n2;
                System.out.println("Integer part of " +n1+ " divided by " +n2+ " is " + res);}
                break;
            case 5:
                if (n2==0){
                    System.out.println("You can't divide by zero!");
                } else {
                    res = n1 % n2;
                    System.out.println("Remainder of " +n1+ " divided by " +n2+ " is " + res);}
                break;
            default:
                System.out.println("Wrong operation!");
                break;
        }
    }
}
