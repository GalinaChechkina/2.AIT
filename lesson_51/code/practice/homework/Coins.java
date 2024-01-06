package practice.homework;

import java.util.Arrays;
import java.util.Random;

public class Coins {
    public static void main(String[] args) {
        int n=10;
        int sum1=0;
        int sum2=0;
        Random random=new Random();
        Integer[]arr=new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            int r= random.nextInt(2);
            arr[i]=r;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                sum1++;
            } else {
                sum2++;
            }
        }
        int res=Math.min(sum1,sum2);
        System.out.println("Minimum number of turns is "+res);
    }
}
