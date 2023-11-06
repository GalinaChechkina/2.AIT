package practice;

public class ArrayApp {
    public static void main(String[] args) {

        int[]number={1,-79,3,46,577,-6,17,38,90,10};  //задали массив
        ArrayMethods.printArray(number);         //печать массива
        System.out.println();                    //переход на новую строку
        int max=ArrayMethods.maximum(number);    //присвоение переменной значения метода
        System.out.println("Max "+max);          //печать максимального элемента массива
        int ind=ArrayMethods.indexmax(number);   //присвоение переменной значения метода
        System.out.println("Index max "+ind);    //печать индекса максимального элемента
        ArrayMethods.selectedSort(number);      //вызов метода сортировки массива по возрастанию
        ArrayMethods.printArray(number);         //печать отсортированного массива
        System.out.println();                    //переход на новую строку
        ArrayMethods.selectedSort1(number);       //вызов метода сортировки массива по убыванию
        ArrayMethods.printArray(number);         //печать отсортированного массива
        System.out.println();                    //переход на новую строку
        ArrayMethods.bubbleSort(number);     //пузырьковый метод (по возрастанию)
        ArrayMethods.printArray(number);
        System.out.println();
        ArrayMethods.bubbleSort1(number);    //пузырьковый метод (по убыванию)
        ArrayMethods.printArray(number);
        System.out.println();
        ArrayMethods.split();                    //вызов метода, печатающего разделительную строку

        int[]number1={100,28,93,43,51,6,7,68,19,1};
        ArrayMethods.printArray(number1);
        System.out.println();
        int maxi=ArrayMethods.maximum(number1);
        System.out.println("Max "+maxi);
        int index =ArrayMethods.indexmax(number1);
        System.out.println("Index max "+index);
        ArrayMethods.selectedSort(number1);
        ArrayMethods.printArray(number1);
        System.out.println();
        ArrayMethods.selectedSort1(number1);
        ArrayMethods.printArray(number1);
        System.out.println();
        ArrayMethods.split();

        String[]letter={"yes","no","may be"};
        ArrayMethods.printArray(letter);
        System.out.println();
        ArrayMethods.split();

        String[]digits={"zero","one","two","three"};
        ArrayMethods.printArray(digits);
        System.out.println();
        ArrayMethods.split();
    }
}
