package practice.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumbersGreaterThanTen {

    //Написать программу, которая:
    // - прочитает с клавиатуры количество вводимых чисел,
    // - прочитает с клавиатуры сами числа и соберёт их в множество,
    // - удалить из множества числа большие 10 и выведет полученные результаты на экран.


    public static void main(String[] args) {

        Set<Integer>numbers=new HashSet<>();
        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you input? ");
        Integer n= scanner.nextInt();
        if (n>0) {
            int count = 1;
            while (count <= n) {
                System.out.println("Input number: ");
                Integer newnum = scanner.nextInt();
                numbers.add(newnum);
                count++;

                System.out.println("Numbers: " + numbers);
                for (Integer i : numbers) {
                    if (i > 10) {
                        numbers.remove(i);
                    }
                }
                System.out.println("Numbers <10: " + numbers);
            }

        } else {
            System.out.println("Ok, another time");
        }
    }
}
