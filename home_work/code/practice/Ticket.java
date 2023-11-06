package practice;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your bus ticket number (6 digits)");
        int n = scanner.nextInt();
        int ost1 = 0;
        int ost2 = 0;
        int count = 0;
        int sum1=0;
        int sum2=0;

        do {
            ost1 =n % 10;
            n = n / 10;
            sum1= sum1+ ost1;
            count++;
        } while (count < 3);
        //int k=n;
        while (n > 0) {
            ost2 =n % 10;
            n = n / 10;
            sum2= sum2+ ost2;
        }
        if (sum1 == sum2) {
            System.out.println("Congratulation! You have a lucky ticket!");
        } else {
            System.out.println("Unfortunately, you have a regular bus ticket!");
        }
    }
}
