package practice.arrMet;

public class ArrMethods1 {
    //  Создайте массив. Подсчитайте, сколько в этом массиве оказалось:
    //  - положительных чисел;
    //  - отрицательных чисел;
    //  - четных чисел;
    //  - нулей.
    //  Оформите решение данной задачи методами и напишите для них тесты.

    public int numOfPosit(int[]array){
        int res=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                res+=1;
            }
        }
        return res;
    }

    public int numOfNeg(int[]array){
        int res=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                res+=1;
            }
        }
        return res;
    }

    public int numZero(int[]array){
        int res=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                res+=1;
            }
        }
        return res;
    }

    public int numOfEven(int[]array){
        int res=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                res+=1;
            }
        }
        return res;
    }
}
