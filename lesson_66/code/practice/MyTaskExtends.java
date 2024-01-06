package practice;

public class MyTaskExtends extends Thread{
    String name;
    int max;

    public MyTaskExtends(String name, int max) {
        this.name = name;
        this.max = max;
    }
    @Override
    public void run() {
        System.out.println(name+" tread started.");//доклад о начале работы
        for (int i = 0; i < max; i++) {
            System.out.println(name+" counted: "+i);//докладывает на каждом шагу
            try {   //кладем поспать
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name+" tread finished.");
    }
}
