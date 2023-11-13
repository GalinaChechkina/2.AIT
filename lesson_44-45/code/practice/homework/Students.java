package practice.homework;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

       String[] list = {"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10"};

       int l1 = list.length / 2;
       int l2 = list.length - l1;

       String[] list1 = new String[l1];
       String[] list2 = new String[l2];

       int n = 0;
       int m = 0;

       for (int i = 0; i < list.length; i++) {

           int c = (int) (Math.random() * 2);//подбрасываю монетку (орел или решка)

           if (c == 0 && n < l1) {
               list1[n] = list[i];
               n++;
           } else if (m < l2) {
               list2[m] = list[i];
               m++;
           } else if (n < l1) {
               list1[n] = list[i];
               n++;
           } else {
               list2[m] = list[i];
               m++;
           }
       }
       System.out.println(Arrays.toString(list));
       System.out.println();
       System.out.println(Arrays.toString(list1));
       System.out.println();
       System.out.println(Arrays.toString(list2));
       System.out.println();
    }
}
