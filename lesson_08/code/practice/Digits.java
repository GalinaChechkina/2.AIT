package practice;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a natural number: ");
        int number= scanner.nextInt();
        System.out.println("Your number is "+number);
        int count=0;
        int ost;
        int sum=0;
        while (number>0) {
            ost= number%10;
            number = number/10;
            sum = sum + ost;
            count++;
        }
            //System.out.println("Digits in number is "+count);
            System.out.println("Sum of digits in number is "+sum);
    }
}
