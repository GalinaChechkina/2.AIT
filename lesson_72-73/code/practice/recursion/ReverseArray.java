package practice.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[]arr={1,3,6,11,13,15,17,19,21,10}; //хотим {21,19,17,15,13,11,6,3,1}
        Arrays.stream(arr).forEach(s-> System.out.print(s+" | "));
        System.out.println();

        reverseArr(arr);
        Arrays.stream(arr).forEach(s-> System.out.print(s+" | "));
        System.out.println();
    }

    private static <T>void reverseArr(T[] arr) {//типизировали метод void, чтобы массив мог быть любого типа
        reverseArr(arr,0,arr.length-1);
    }

    private static <T>void reverseArr(T[] arr, int l, int r) {
        if(l>=r){
            return;//если дошли до середины, то вышли из метода
        }
        T temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverseArr(arr,l+1, r-1);
    }
}
