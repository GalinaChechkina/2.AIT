package practice;

public class MultNum {
    //Найти произведение двузначных нечетных чисел кратных 17.

    public static void main(String[] args) {
        int n=1;
        int[] arr = new int[90];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+i*n;
        }
        int mult=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0&&arr[i]%17==0){
                mult*=arr[i];
            }
        }
        System.out.println(mult);
    }
}
