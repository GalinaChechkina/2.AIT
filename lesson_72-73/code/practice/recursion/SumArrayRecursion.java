package practice.recursion;

import java.util.Arrays;

public class SumArrayRecursion {
    public static void main(String[] args) {
        int[]arr={1,3,6,11,13,15,17,19,21,10,10}; //хотим сложить элементы массива
        Arrays.stream(arr).forEach(s-> System.out.print(s+" | "));
        System.out.println();

        int sum= sumArrRecursion(arr,0);
        System.out.println("Sum of array elements: "+sum);
        System.out.println();
    }

    private static int sumArrRecursion(int[] arr,int i) {
        int res=0;
        if(i==arr.length){
            return res;
        } else {
             res = arr[i];
            res = res + sumArrRecursion(arr, i + 1);
            return res;
        }
    }
}
