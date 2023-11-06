package practice;

public class ArrayAction {
    public static void main(String[] args) {
        // Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        // Найдите минимальный элемент массива и его индекс. Напечатайте все элементы массива с НЕчетными индексами.
        // Найдите произведение всех четных элементов массива.

        int[] arr = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};
        int min = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                j = i;
            }
        }
        System.out.println("Minimum array element  " + min);
        System.out.println("The min element number  " + j);
        System.out.println("Array elements with odd elements:");
        printAArray (arr);
        System.out.println();
        int mult= multEv(arr);
        System.out.println("Produkt of even elements:  "+mult);
    }
    public static void printAArray(int[]mas){
        for (int i = 0; i < mas.length; i++) {
            if (i%2!=0){
                System.out.print(mas[i]+"  ");
            }
        }
    }
    public static int multEv(int[]mas){
        int res=1;
        for (int i = 0; i < mas.length; i++) {
            if (i%2==0){
            res*=mas[i];
            }
        }
        return res;
    }
}








