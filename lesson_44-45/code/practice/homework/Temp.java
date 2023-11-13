package practice.homework;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        // Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
        // Данные представлены в виде двух массивов. Рассчитайте среднюю температуру в городе
        // за прошедшие две недели.

        double[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        double[] arr2 = {8, 9, 10, 11, 12, 13, 14};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("-----------------------");

        double sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        double sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        double res=(sum1+sum2)/(arr1.length+ arr2.length);
        System.out.println("Average temperature for two weeks is "+res);


    }
}
