package practice;

import java.util.Scanner;

public class Stroka {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input any string of characters");
        String str = scanner.nextLine();
        System.out.println("Input any number of repetition within reason");
        int n = scanner.nextInt();
        while (n>0){
            System.out.println(str);
            n--;
        }
    }
}
