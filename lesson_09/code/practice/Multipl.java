package practice;

public class Multipl {
    public static void main(String[] args) throws InterruptedException {
        int n=1;
        int m=1;
        while (n<=10){
            while (m<=10) {
                System.out.print(m + " * " + n + " = " + m * n + " | ");
                Thread.sleep(300);
                m++;
            }
            System.out.println();
            m=1;
            n++;
        }
    }
}
