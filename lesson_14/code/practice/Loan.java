package practice;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        //Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
        //Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many thousand rubles is your loan? ");
        int s= scanner.nextInt();
        System.out.println("Input the amount of debt you would like to achieve: ");
        int n= scanner.nextInt();

        int time= years(s,n);
        System.out.println("In "+time+" years you yill achieve your desired debt!");
    }
    public static int years(int s, int n){
        int count=0;
        double res=s;
        while (res<n){
            res=res*1.1;
            count++;
        }
        return count;
    }
}



