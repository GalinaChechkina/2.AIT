package practice;

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
      //  В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
        //  Использовать цикл for.

        Scanner scanner=new Scanner(System.in);
        System.out.println("How much money would you like to put in the bank? ");
        int s= scanner.nextInt();
        System.out.println("For how many years would you like to make a deposit? ");
        int n= scanner.nextInt();
        double dep= deposit(s,n);
        System.out.println(dep);
    }
    public static double deposit(int s,int n){
        double[]arr=new double[n];
        arr[0]=s;
        for (int i = 1; i <n; i++) {
            arr[i]=arr[i-1]+arr[i-1]*0.03;
        }
        return arr[n-1];
    }
}
