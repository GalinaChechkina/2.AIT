package practice;

public class ReverseArr {
    public static void main(String[] args) {
       // Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
        // Сначала последний элемент, потом предпоследний, и т. д.
        // Протестируйте работу метода на массиве заполненном цифрами прописью:
        // zero, one, two, three, ..., nine Выполните "разворот" исходного массива.
        String[]arr1={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[]arr2={1,2,3,4,5,6,7,8,9};
        reverse(arr2);
        reverse1(arr1);
    }

    public static void reverse (int[]arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void reverse1(String[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }
}
