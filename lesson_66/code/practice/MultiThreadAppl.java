package practice;

import java.util.Arrays;

public class MultiThreadAppl {

    private static final int MAX = 10;
    private static final int SIZE = 3;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started.");
        
        MyTaskImplements task1=new MyTaskImplements("Parallel one",MAX);
        MyTaskExtends task2=new MyTaskExtends("Parallel two",MAX);

        Thread thread1=new Thread(task1); //передали в конструктор объект Runnable типа Tread
        Thread thread2=new Thread(task2); //передали в конструктор объект  типа Tread

        thread1.start();
        thread2.start();

        MyTaskImplements[] tasks=new MyTaskImplements[SIZE]; //создаем массив параллельных задач, которые вложим в потоки
        for (int i = 0; i < tasks.length; i++) {
            tasks[i]=new MyTaskImplements("Name "+i, MAX);
        }
        Thread[]threads=new Thread[SIZE]; //создаем массив потоков
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(tasks[i]);
        }

        for (int i = 0; i < SIZE; i++) {
            threads[i].start();
            threads[i].join(); // так делать не надо
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main counted: "+i);
            try {                                  //кладем поток поспать
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread1.join(); //присоединение к идущему процессу (нужно для того, чтобы main завершился последним)
        thread2.join();
        for (int i = 0; i < SIZE; i++) {
            threads[i].join();
        }
        System.out.println("Main tread finished");
    }
}
