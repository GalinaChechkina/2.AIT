package practice;

public class Lucky1 {
//Часть 1. Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2. Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету,
// которая увеличивает вес пельменя на 15 грамм. Напишите программу, которая ищет счастливый пельмень.

    public static void main(String[] args) {

        int[] arr = new int[30];
        int a = 25;
        int b = 35;
        ArrayMethods.fillArray(arr, a, b);
        ArrayMethods.printArray(arr);

        int[]arr1=putLucky(arr);
        ArrayMethods.printArray(arr1);

        int index= search(arr);
        System.out.println((index+1)+"-й пельмень - счастливый!!!!");
    }

    public static int[] putLucky(int[]arr){
        int a=0;
        int b=29;
        int n= (int) (Math.random() * (b - a + 1) + a);
        for (int i = 0; i < arr.length; i++) {
            if (i==n){
                arr[i]=arr[i]+15;
            }
        }
        return arr;
    }
    public static int search(int[]arr){
        int ind=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>35){
                ind= i;
            }
        }
        return ind;
    }
}
