package practice;

import java.util.Random;

public class SearchDupl {
   // Заполните массив целых чисел числами по порядку от 1 до 100.
   // Задумайте случайное число в интервале от 1 до 100 и добавьте его в массив на произвольную (случайную)
   // позицию. Найдите добавленный в массив дубликат наиболее простым способом.

    public static void fillArray(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
    }

    public static void printArray(Integer[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static Integer[] addNumber(Integer[] array, int n){
        int ind= (int) (Math.random()*100);
        for (int i = 0; i < array.length; i++) {
            if (i==ind) {
                array[i] = array[i]+n;
            }
        }
        return array;
    }

    public static void searchDupl(Integer[] array){
        int res= 0;
        int ind= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=i+1) {
                res=array[i]-i-1;
                ind=i;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("The desired duplicate is "+res+". Duplicate index is "+ind);
    }
}
