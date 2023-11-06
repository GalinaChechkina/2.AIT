package practice;

public class DuplicateNumber {
    public static void main(String[] args) {
        // Поиск дубликатов в массиве. Подход #2. Упростим задачу следующим образом.
        // Имеется массив целых чисел, давайте узнаем, сколько раз в нем встретилось заданное число.
        int[] arr = {30, 18, 45, 52, 45, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};
        int num = 45;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Let's look for the number 45 ");
        System.out.println("The number 45 appeared in the array " + count + "  times");
    }
}