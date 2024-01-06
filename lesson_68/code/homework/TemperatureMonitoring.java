package homework;

import java.util.*;

public class TemperatureMonitoring {

    //В массиве с ночной температурой за прошедшие 2 недели выяснить
    // - сколько раз ночью была минусовая температура.+
    // - В какой из дней наблюдений случился первый заморозок?+
    // - Когда был такой последний день?+
    // - Какая максимальная температура была за период наблюдений? В какой день это было?+
    // - Какая минимальная температура была за период наблюдений? В какой день это было?+
    // - Какая средняя ночная температура была за период наблюдений?
    // - Были ли периоды, когда минус ночью держался несколько дней подряд?

    private static final int NUM=14;
    private static final int MIN=-5;
    private static final int MAX=5;
    public static void main(String[] args) {

        int[]temp=createAnArray(NUM);
        printArray(temp); // печатаю массив
        maxTemperature(temp); // дни с максимальной температурой
        minTemperature(temp); // дни с минимальной температурой
        isNegativeTemp(temp); // есть ли периоды с отрицательной температурой

        int count= (int) Arrays.stream(temp).filter(p->p<0) // сколько дней с отрицательной температурой было
                .count();
        System.out.println("Negative temperature persisted "+count+" days.");

        double avgTemp=  Arrays.stream(temp).asDoubleStream() // средняя температура
                .average()
                .getAsDouble();
        System.out.printf("Average temperature: %.2f", avgTemp);
        System.out.println();

        Map<Integer, Integer>map=new HashMap<>(); // первый заморозок
        for (int i = 0; i < temp.length; i++) {
            map.put(i+1,temp[i]);
        }
        //map.entrySet().forEach(System.out::println);

        Map.Entry<Integer,Integer> frostFirst=map.entrySet().stream()
                .filter(p->p.getValue()<0)
                .findFirst()
                .orElse(null);

        if(frostFirst==null){
            System.out.println("There were no frosts");
        }
        System.out.println("The first frost occurred on the day of observation: "+frostFirst.getKey());
        System.out.println("Temperature dropped to "+frostFirst.getValue()+" degrees");

        Map<Integer,Integer>mapReverse=new HashMap<>(); // последний заморозок
        for (int i = 0; i < temp.length; i++) {
            mapReverse.put(temp.length-i,temp[i]);
        }
        Map.Entry<Integer,Integer> frostLast=mapReverse.entrySet().stream()
                .filter(p->p.getValue()<0)
                .findFirst()
                .orElse(null);

        if(frostFirst==null){
            System.out.println("There were no frosts");
        }
        System.out.println("The last frost occurred on the day of observation: "+(temp.length-frostLast.getKey()+1));
        System.out.println("Temperature dropped to "+frostLast.getValue()+" degrees");
    }

    private static void isNegativeTemp(int[] temp) {

        boolean isTrue=true;
        for (int i = 0; i < temp.length-1; i++) {
            if(temp[i]<0 && temp[i+1]<0) {
                isTrue=true;
            } else {
                isTrue=false;
            }
        }
        if(isTrue){
            System.out.println("There are periods when negative temperatures last for several days in a row.");
        }
        if (!isTrue){
            System.out.println("There are no periods when negative temperatures last for several days in a row.");
        }
        System.out.println("----------------------------------");
    }

    private static void minTemperature(int[] temp) {

        System.out.println("Min temperature: ");
        int min=100;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == min) {
                System.out.print((i + 1) + " day- " + temp[i] + " | ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    private static void maxTemperature(int[] temp) {

        System.out.println("Max temperature: ");
        int max=-100;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == max) {
                System.out.print((i + 1) + " day- " + temp[i] + " | ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    private static int[] createAnArray(int NUM) {
        int[]arr=new int[NUM];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=MIN+ random.nextInt(MAX-MIN+1);
        }
        return arr;
    }
    private static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }
}
