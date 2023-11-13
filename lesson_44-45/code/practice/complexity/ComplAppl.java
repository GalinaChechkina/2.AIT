package practice.complexity;

import java.util.Arrays;

public class ComplAppl {
    public static void main(String[] args) {
        int[]arr={-24,0,-67,15,8,93,1};

        //вычисляем среднее значение:
        // - длина массива
        // - сумма элементов массива
        // - сумма/количество элементов

        int sum=0;
        for (int i = 0; i < arr.length; i++) {     //если пробегаем по массиву, то сложность линейная O(n)
            sum += arr[i];
        }
        double res=(double)sum/ arr.length;
        System.out.println(res);

        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /*int index = Arrays.binarySearch(arr,-100);//если бинарный поиск, то сложность логарифмическая O(log n)
        System.out.println(index);*/

        for (int i = 0; i < arr.length-1; i++) {    //если пузырьковый метод, то сложность квадратичная сложность O(n^2)
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);                        //если метод Arrays.sort, то сложность полилинейная O(n log n)
        System.out.println(Arrays.toString(arr));


    }
}
