package practice;

import java.util.Scanner;

public class FactorCalc {
    public static void main(String[] args) {
        //Вводится n - натуральное число. Напишите метод, который получает на вход n и
        // вычисляет n! = 1 * 2 * 3 *... * n. Вызовите полученный метод.
        // При каком значении n происходит переполнение памяти, выделяемой для n типа int? Использовать цикл for.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a natural number :");
        int n= scanner.nextInt();
        int fact=factorialCalc(n);
        System.out.println("Factorial number : "+fact);
    }
    public static int factorialCalc(int n){
        int res=1;
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < n; i++) {
            res*=arr[i];
        }
        return res;
    }
}
