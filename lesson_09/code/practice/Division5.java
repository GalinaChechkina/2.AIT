package practice;

public class Division5 {
    public static void main(String[] args) throws InterruptedException {
        /*int n=1;
        while (n<=100){
            if (n%5==0) {
                System.out.print(n + " ; ");
                Thread.sleep(300);
            }
            n++;
        }*/
        int n=1;
        while (n<=200) {
            if (n % 13 == 0) {
                System.out.print(n + " ; ");
                Thread.sleep(300);
            }
            n++;
        }
    }
}
