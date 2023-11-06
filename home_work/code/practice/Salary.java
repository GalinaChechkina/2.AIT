package practice;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        int a = 500;
        double sal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years have you worked with us?");
        int n = scanner.nextInt();

        if (n > 0 & n < 3) {
            sal = a;
            System.out.println("Your salary is " + sal);
        }
        if (n >= 3 & n < 5) {
            sal = 1.1 * a;
            System.out.println("Your salary is " + sal);
        }
        if (n >= 5 & n < 10) {
            sal = 1.65 * a;
            System.out.println("Your salary is " + sal);
        }
        if (n >= 10 & n < 15) {
            sal = 3.3 * a;
            System.out.println("Your salary is " + sal);
        }
        if (n >= 15) {
            sal = 4.95 * a;
            System.out.println("Your salary is " + sal);
        }
        if (n <= 0) {
            System.out.println("Invalid request!");
        }
    }
}



