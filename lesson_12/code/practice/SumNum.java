package practice;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
       // Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
        // Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a integer number greater than 1 : ");
        int num= scanner.nextInt();
        System.out.println("Sum is :");
        double[]arr=new double[num];
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[0]=1;
            arr[i]=(double) 1/(i+1);
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  +  ");
        }
        System.out.println(" = "+sum);
    }
}

