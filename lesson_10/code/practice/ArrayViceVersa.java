package practice;

import static java.util.Collections.swap;

public class ArrayViceVersa {
    public static void main(String[] args) throws InterruptedException {
        int a=10;
        int b=30;
        int[]arrayNum= new int[20];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int)(Math.random() * (b - a + 1) + a);
            System.out.print(arrayNum[i]+"  ");
            Thread.sleep(200);
        }
        System.out.println();
        for (int i = 0; i < arrayNum.length/2; i++) {
            int n = arrayNum[i];
            arrayNum[i] = arrayNum[arrayNum.length - 1 - i];
            arrayNum[arrayNum.length - 1 - i] = n;
        }
        for (int i = 0; i < arrayNum.length ; i++) {
            System.out.print(arrayNum[i] + "  ");
            Thread.sleep(200);
        }
    }
}

