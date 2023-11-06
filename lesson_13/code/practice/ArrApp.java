package practice;

public class ArrApp {
    //Создать 2 числовых массива, один на 10, другой на 20 элементов.
    //Выполнить сортировку этих массивов методами:
    // - сортировка выбором,
    // - пузырьковая сортировка
    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, -4, 5, -6, 7, -8, 9, 0};

        ArrayMethods.printArray(array1);
        System.out.println();
        ArrayMethods.bubbleSort1(array1); //Сортировка пузырьковым методом по убыванию
        ArrayMethods.printArray(array1);
        System.out.println();
        ArrayMethods.selectedSort(array1);    //Сортировка выбором по возрастанию
        ArrayMethods.printArray(array1);
        System.out.println();
        ArrayMethods.split();

        int[] array2 = {17, 0, 45, -60, 2, -1, 23, 7, 10, 2, 2, 2, 70, 65, 59, 75, 5, 13, 1, 20};
        ArrayMethods.printArray(array2);
        System.out.println();
        ArrayMethods.bubbleSort(array2); //Сортировка пузырьковым методом по возрастанию
        ArrayMethods.printArray(array2);
        System.out.println();
        ArrayMethods.selectedSort1(array2);    //Сортировка выбором по убыванию
        ArrayMethods.printArray(array2);
        System.out.println();
        ArrayMethods.split();
    }

}
