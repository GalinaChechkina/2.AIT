package practice.consultation.race;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TarakanRaceAppl {
    //    Создать приложение-игру «TarakansRace». Таракан - поток, выполняющий цикл итераций.
    //    На каждой итерации поток выводит свой собственный номер и переходит в режим сна на
    //    случайное количество миллисекунд [2-5]. Диапазон времени сна должен быть одинаковым
    //    для всех тараканов. Таракан, закончивший круг первым, считается победителем.
    //    Приложение должно принимать количество тараканов и расстояние (колличество итераций)
    //    из консольного ввода/вывода.
    //    В конце игры должно быть распечатано следующее сообщение
    //    “Congratulations to tarakan #X (winner)” где Х - номер таракана-победителя.
    public static void main(String[] args) throws NumberFormatException, IOException {

        // вместо сканера организуем чтение с клавиатуры с помощью BufferedReader:

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Number of tarakans:");
        int numTarakans = Integer.parseInt(br.readLine()); // перевели введенную строку в целое число

        System.out.println("Distance:");
        int distance = Integer.parseInt(br.readLine());
        Tarakan.setDistance(distance); // передали дистанцию в поле объекта Tarakan

        Thread[] tarakans = startRace(numTarakans); // организуем массив потоков для бега тараканов
        waitFinish(tarakans); // если не ждать все потоки, то быстрее всех выполнится main, и поздравления достанутся null
        System.out.println("Congratulations to " + Tarakan.getWinner()+" !!!!");
    }
    private static void waitFinish(Thread[] tarakans) {
        for (int i = 0; i < tarakans.length; i++) {
            try {
                tarakans[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static Thread[] startRace(int n) {
        Thread[] threads = new Thread[n]; // создаем массив с числом тараканов n
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Tarakan("Tarakan N" + (i + 1))); // новый поток, которому передали процесс на базе класса, имплементирующего интерфейс Runnable
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start(); // запускаем потоки, которые начинают выполнение метода run();
        }
        return threads;
    }
}