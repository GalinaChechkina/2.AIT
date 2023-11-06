package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a natural number");
        int n= scanner.nextInt();
        boolean isPrime=true;
        int div=2;
        while (div<n){
            if (n%div==0){
                isPrime= false;
            }
            div++;
        }
        System.out.println("Number "+n+" is Prime- "+isPrime);
    }
}
