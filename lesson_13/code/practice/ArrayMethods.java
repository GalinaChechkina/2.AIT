package practice;

public class ArrayMethods {
    public static void printArray(int[]arr){      //метод, реализующий печать целочисленного массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void printArray(String[]arr){   //метод, реализующий печать строкового массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static int minimum(int[]arr){         //метод принимает массив и выдает минимальный элемент массива
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int indexMin(int[]arr){       //метод принимает массив и выдает индекс минимального элемента массива
        int min=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index =i;
            }
        }
        return index;
    }
    public static int maximum(int[]arr){       //метод принимает массив и выдает максимальный элемент массива
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int indexmax(int[]arr){     //метод принимает массив и выдает индекс максимального элемента массива
        int max=arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index=i;
            }
        }
        return index;
    }

    public static int[] selectedSort(int[]arr){    //метод, реализующий сортировку массива по возрастанию
        int min=arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index=i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j]< min) {
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }

    public static int[] selectedSort1(int[]arr){    //метод, реализующий сортировку массива по убыванию
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int index=i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j]> max) {
                    max=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {  // сортировка ПУЗЫРЬКОВЫМ методом по возрастанию
        for (int i = 0; i < arr.length - 1; i++) {
          for (int j = 0; j < arr.length - 1 - i; j++) {
              if (arr[j] > arr[j + 1]) {
                  int t = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = t;
              }
          }
        }
    }

    public static void bubbleSort1(int[] arr) {  // сортировка ПУЗЫРЬКОВЫМ методом по убыванию
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public static void split(){                //метод, печатающий разделительную строку
        System.out.println("-------------------------------");
    }
    public static int[] fillArray(int[]arr,int a, int b){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) (Math.random() * (b - a + 1) + a);
        }
        return arr;
    }
}
