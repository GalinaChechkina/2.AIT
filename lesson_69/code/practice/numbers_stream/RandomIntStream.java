package practice.numbers_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomIntStream {
    private static final int N_NUMBERS=6;
    private static final int MIN=-10;
    private static final int MAX=10;
    public static void main(String[] args) {

        //- создать с помощью stream поток случайных целых чисел;
        //- выведите на печать элементы потока;
        //- сколько в потоке получилось положительных чисел? сколько отрицательных?
        //- просуммируйте все нечетные элементы потока;
        //- найдите максимальное число, минимальное число;
        //- выведите значения метода summaryStatistic.

        Stream<Integer>numbers=getRandomNum(N_NUMBERS,MIN,MAX);
        numbers.forEach(s-> System.out.print(s+" "));
        System.out.println();

        long posCount=getRandomNum(N_NUMBERS,MIN,MAX)//используем long, так как стрим дает значение long
                .peek(s-> System.out.print(s+" "))
                .filter(p->p>0)
                .count();
        System.out.println("\nPositive numbers: "+posCount);

        long negCount=getRandomNum(N_NUMBERS,MIN,MAX)
                .peek(s-> System.out.print(s+" "))
                .filter(p->p<0)
                .count();
        System.out.println("\nNegative numbers: "+negCount);

        int oddSum=getRandomNum(N_NUMBERS,MIN,MAX)
                .peek(s-> System.out.print(s+" "))
                .filter(p->p%2!=0)
                .mapToInt(n->n.intValue())//перевели поток из класса-обертки Integer в int и взяли у каждого объекта его значение
                .sum();
        System.out.println("\nSum odd numbers: "+oddSum);

        int max=getRandomNum(N_NUMBERS,MIN,MAX)
                .peek(s-> System.out.print(s+" "))
                .max(Comparator.naturalOrder())//сравнение будет обычным образом
                .orElseThrow();//если мах не найдется, то выйдет ошибка
        System.out.println("\nMax value: "+max);

        IntSummaryStatistics stat=getRandomNum(N_NUMBERS,MIN,MAX)
                .peek(s-> System.out.print(s+" "))
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("\n"+stat);

    }

    private static Stream<Integer> getRandomNum(int nNumbers, int min, int max) {
        return new Random()
                .ints(min,max)
                .limit(N_NUMBERS)
                .boxed(); //упаковали в числа
    }
}
