package practice;

public class ArrayApp3 {
    public static void main(String[] args) {

        /*int[] array = {-50, -10, 20, -100, 70, 60, 40, -10, 30, 50};

        ArrayMethods3.printArray(array);
        ArrayMethods3.bubbleSort(array);
        ArrayMethods3.printArray(array);
        int index= ArrayMethods3.binarySearch(array, -100 );   // вызываем binarySearch
        System.out.println("Index of the element being searched is "+index);

        int count=ArrayMethods3.searchDupl(array, -100);
        System.out.println("Element "+(-100)+" present "+count+" times");*/

        //Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
        // Выполните сортировку полученного массива. Попало ли число 0 в этот массив?
        // (выяснить с помощью binary search) Если да, то на какое место (индекс) в массиве?
        // Если нет, то на какой индекс его следует поставить?

        int[]arr=new int[20];
        int a=-100;
        int b=100;
        ArrayMethods3.fillArrayRandomInt(arr,a,b);
        ArrayMethods3.printArray(arr);
        ArrayMethods3.sortedSort(arr);
        ArrayMethods3.printArray(arr);

        int n= ArrayMethods3.binarySearch(arr, 0);

        if (n>=0){
            System.out.println("Number 0 is present in the array in "+n+"  place");
        } else {
            System.out.println("Number 0 is not in the array. But if it were, it would occupy the "+(-n-1)+" position");
        }
    }
}
