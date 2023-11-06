package practice;

public class ArrayNumber {
    public static void main(String[] args) {

        int[]arrayNum= {56,73,15,-10,37,-14,25,65,33,38};

        int max=arrayNum[0];
        int j=0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > max) {
                max = arrayNum[i];
                j=i;
            }
        }
        System.out.println("Maximum array element  " +max);
        System.out.println("The max element number  " +j);
    }
}
