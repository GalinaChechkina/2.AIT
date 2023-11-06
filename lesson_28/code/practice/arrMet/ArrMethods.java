package practice.arrMet;

public class ArrMethods {
    //  Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
    //  - сумма всех элементов массива;
    //  - поиск элемента в массиве;
    //  Разработайте тесты для этих методов.

    public int sumElements(int array[]){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
    public double searchElement(int array[], int ind){
        double res=1.11;
        for (int i = 0; i < array.length; i++) {
            if (i == ind) {
                res = array[i];
                System.out.println("Element with index " + i + " is " + res);
            }
            if(ind<0&&ind>array.length){
                System.out.println("The index isn't correct!");
            }
        }
        return res;
    }
}
