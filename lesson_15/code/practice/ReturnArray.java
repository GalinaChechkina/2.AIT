package practice;

public class ReturnArray {
    // Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
    // Реализуйте метод, который получает на вход исходный массив и возвращает массив,
    // содержащий только положительные числа из исходного массива.

    public static void main(String[] args) {

        int[] arr = new int[20];
        int a=-100;
        int b=100;

        ArrayMethods3.fillArrayRandomInt(arr, a, b);
        ArrayMethods3.printArray(arr);
        int[] arr1 = retArray(arr);
        ArrayMethods3.printArray(arr1);
    }

    public static int[]retArray(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 0) {
                    array[i] = arr[j];
                    i++;
                }
            }
        }
        return array;
    }
}
