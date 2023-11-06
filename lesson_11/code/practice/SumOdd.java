package practice;

import java.util.Arrays;

public class SumOdd {
    public static void main(String[] args) {
        int a=-10;
        int b= 10;
        int[]randomInt= new int[10];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i]= (int)(Math.random() * (b - a + 1) + a);
        }
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] +"  ");
        }
        System.out.println();
        int sum= sumArr(randomInt);
        System.out.println(sum);

        int mult = multArr(randomInt);
        System.out.println(mult);

        int[]randomInt1= reverseArr(randomInt);
        System.out.println(Arrays.toString(randomInt1));
    }

    public static int sumArr(int[]arr){
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                res += arr[i];
            }
        }
        return res;
    }

    public static int multArr(int[]arr){
        int res=1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                res *= arr[i];
            }
        }
        return res;
    }

    public static int[] reverseArr(int[]arr) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr.length/2; i++) {
                int n= arr[i];
                arr1[i] = arr[arr.length-1-i];
                arr1[arr.length-1-i]= n;
        }
        return   arr1;
    }
}
