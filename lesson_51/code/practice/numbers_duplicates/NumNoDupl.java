package practice.numbers_duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumNoDupl {
    public static void main(String[] args) {

    //   Имеется список из 100 случайных чисел в интервале от 1 до 10.
    //   Удалить из него все дубликаты

        int[]num=new int[100];
        int a=1;
        int b=11;
        Random random=new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]= random.nextInt(a,b);//заполнили массив случайными числами от 1 до 10
        }
        System.out.println(Arrays.toString(num));

        Set<Integer>uniqueNumbers=new HashSet<>();
        System.out.println("Size of set: "+uniqueNumbers.size());
        System.out.println("Is empty? true/false "+uniqueNumbers.isEmpty());
        System.out.println("-----------------------------------");

        for (int i = 0; i < num.length; i++) {
            uniqueNumbers.add(num[i]);
        }
        for (Integer n:uniqueNumbers) {
            System.out.print(n+" ");
        }
        System.out.println();

        /*for (Integer n:uniqueNumbers) {
            uniqueNumbers.add(n);
        }

        uniqueNumbers.forEach(s-> System.out.print(s+" "));//тоже печать
        System.out.println();

        System.out.println(uniqueNumbers);//тоже печать*/
    }
}
