package practice.utils1;


import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools1 {
    public static void printArray(Object[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("===========");
    }
    public static int search(Object[]arr,Object value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    //в Java есть тест Predicate, кот. возвращает истину или ложь, т.е. проверяет условие
    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
            }
        }
    }

    public static <T> void bubbleSortComparator(T[]arr, Comparator<T>comparator){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(comparator.compare(arr[j],arr[j+1])>0){
                    T n=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=n;
                }
            }
        }
    }

    // Напишите OddEvenComparator, реализующий Comparator с методом сравнения для сортировки
    // массива целых чисел в следующем порядке: Четные целые числа должны идти перед нечетными числами.
    
    // Обновите OddEvenComparator методом сравнения для сортировки массива целых чисел в следующем порядке:
    // Четные целые числа должны идти перед нечетными числами в порядке возрастания.
    // Нечетные целые числа должны идти после четных в порядке убывания.
    // Integer[] origin = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };
    // Integer[] expected = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };

    public static  void addEvenComparator(Integer[]arr, Comparator<Integer> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare((arr[j] % 2), (arr[j + 1] % 2)) > 0) {
                    Integer n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }
            }
        }
    }
    //еще два перегруженных метода для бинарного поиска:
    //-c compareTo
    //-c comparator

    public static <T extends Comparable<T>> int binarySearchComparable(T[]arr,T num){
        int left=0;
        int right= arr.length-1;
        while (left<=right){
            int mid= (left+right)/2;
            if (arr[mid].compareTo(num)==0){
                return mid;
            } else if (arr[mid].compareTo(num)>0) {
                right = mid - 1;
            } else {
                left=mid+1;
            }
        }
        return -left-1; //возвращаем отрицательный индекс, если элемент не найден
    }

    public static <T> int binarySearchComparator (T[]arr,T num,Comparator<T>comparator){
        int left=0;
        int right= arr.length-1;
        while (left<=right){
            int mid= (left+right)/2;
            if (comparator.compare(arr[mid],num)==0){
                return mid;
            } else if (comparator.compare(arr[mid],num)>0) {
                right = mid - 1;
            } else {
                left=mid+1;
            }
        }
        return -left-1;
    }
}
