package practice;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class StreamPrimitivesAppl {
    private static final int N_NUMBERS=10;
    private static final int MIN=1;
    private static final int MAX=10;
    public static void main(String[] args) {
        Stream<Integer>numbers=getRandomNubers(N_NUMBERS,MIN,MAX);
        numbers.forEach(s-> System.out.print(s+" "));
        System.out.println();

        int sum=getRandomNubers(N_NUMBERS,MIN,MAX)
                .mapToInt(Integer::intValue) //преобразовали Integer в int
                .peek(System.out::println)//промежуточная печать
                //.mapToInt(n->(int) n) //можно так
                .sum();
        System.out.println("Sum of numbers: "+sum);

        IntSummaryStatistics statistics=getRandomNubers(N_NUMBERS,MIN,MAX)
                .mapToInt(n->(int) n)
                .peek(System.out::println)
                .summaryStatistics();
        System.out.println(statistics);//можно брать getMin, getMax, getSum, getAverage, getCount
        System.out.println();

        new Random()
                .ints(1,50)
                .distinct()//это лото - не должно быть одинаковых чисел
                .limit(6)
                .forEach(e-> System.out.print(e+" "));
        System.out.println();
        System.out.println("------------------------------");

        int[]arr={10,20,30,40,50,60,70,80,90};
        new Random()
                .ints(0, arr.length)
                .distinct()
                .limit(arr.length)
                .forEach(e-> System.out.print(arr[e]+" "));


    }

    private static Stream<Integer> getRandomNubers(int nNumbers, int min, int max) {
        return new Random() //вызвали класс Random
                .ints(min,max)//у него есть запуск стрима
                .limit(nNumbers) //ограничили количество чисел в потоке
                .boxed();// упаковка из int в Integer
                //.mapToObj(n->(Integer) n); // можно так упаковывать
    }
}
