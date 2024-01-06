package practice.consultation.race;

import java.util.Random;

public class Tarakan implements Runnable {
    static int distance;          // спросим у пользователя (количество итераций)
    static int minSleepTime = 2;  // время сна случайно, но одинаково для всех тараканов
    static int maxSleepTime = 5;
    static String winner;         // переменная, которая сначала у всех тараканов null
    static Random random = new Random();
    String name;

    public Tarakan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getWinner() {
        return winner;
    }

    public static void setDistance(int distance) {
        Tarakan.distance = distance;
    }

    public static void setMinSleepTime(int minSleepTime) {
        Tarakan.minSleepTime = minSleepTime;
    }

    public static void setMaxSleepTime(int maxSleepTime) {
        Tarakan.maxSleepTime = maxSleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            int sleepTime = minSleepTime + random.nextInt(maxSleepTime + 1 - minSleepTime);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+" is moving.");
        }
        System.out.println(name+" is finished!!!!!!!!!!!!");
        if (winner == null) { //как только таракан закончил дистанцию, мы проверяем переменную winner
            winner = name;    //если она null, то этой переменной присваивается имя таракана и это победитель
        }
    }
}