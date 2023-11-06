package practice;

public class Lucky {
    public static void main(String[] args) {
       // Поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
        // В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
        // Напишите программу, которая ищет счастливый пельмень.

        int[]arr= new int[30];
        int a=0;
        int b=29;
        int n= (int)(Math.random() * (b - a + 1) + a);
        for (int i = 0; i < arr.length; i++) {
            if (i == n ) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                System.out.println((i+1)+" -ый пельмень счастливый!");
            }
        }
    }
}
