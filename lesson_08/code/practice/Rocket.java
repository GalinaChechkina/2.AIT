package practice;

public class Rocket {
    public static void main(Stroka[] args) throws InterruptedException {
        int countDown=10;
        while (countDown>=0){
            System.out.println(countDown);
            Thread.sleep(300);
            countDown--;
        }
        System.out.println("Go!");
    }
}
