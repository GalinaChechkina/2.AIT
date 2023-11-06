package practice;

public class Cubik {
    public static void main(String[] args) {
       // Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько раз выпала каждая цифра.

                                   //(int)(Math.random() * (b - a + 1) + a);
        int[]arr=new int[20];
        fillArray(arr);
        printArray(arr);
        System.out.println();

        int[] arrayNum ={1,2,3,4,5,6};
        for (int i = 0; i < arrayNum.length; i++) {
            int cur = arrayNum[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (cur == arr[j]) {
                    count++;
                }
            }
            System.out.println("number " + cur + " reap " + count + " times");
        }
    }

    public static void fillArray(int[] array){
        int a=1;
        int b=6;
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random() * (b - a + 1) + a);
        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
