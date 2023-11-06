package practice.arrTest;

public class Arr {
    // Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
    // Найдите среднюю величину по всем четным элементам массива.
    // Разработайте соответсвующий тест (набор тестов).
    int[]array={-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
    public static double averEven(int[]ar){
        double n =0;
        double count=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]%2==0){
                n+=ar[i];
                count+=1;
            }
        }
        if(count!=0) {
            return n / count;
        }
        return Math.PI;
    }
}
