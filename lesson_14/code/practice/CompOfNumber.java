package practice;

import java.util.Scanner;

public class CompOfNumber {
    public static void main(String[] args) {
        // Ввести с клавиатуры 10 пар целых чисел.
        // Сравните числа в каждой паре и напечатайте большие из них. Использовать цикл for.

        Scanner scanner= new Scanner(System.in);
        int[]arr=new int[20];
        int n=1;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                System.out.print("  Input first number "+n+" paar  \t");
                arr[i]= scanner.nextInt();
            }else {
                System.out.print("  Input second number "+n+" paar  \t");
                arr[i]= scanner.nextInt();
                n++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=arr[i+1]){
                System.out.print(arr[i]+"\t");
                i++;
            } else {
                System.out.print(arr[i+1]+"\t");
                i++;
            }
        }
    }
}
