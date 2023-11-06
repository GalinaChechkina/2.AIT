package practice;

import java.awt.*;
import java.util.Scanner;

public class Sport {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many meters did you run on the first day?");
        double m= scanner.nextInt();
        System.out.println("How many meters would you like to run in a day?");
        int t= scanner.nextInt();

        int day=1;
        while (m<t) {
            m = m + 0.1 * m;
            day++;
        }
        if (m>=40000){
            System.out.println("The distance is too long, \n but if you are confident in your abilities, \n you will reach your target in " +day+ " days");
        } else {
            System.out.println("You will reach your target in " + day + " days");
        }
    }
}
