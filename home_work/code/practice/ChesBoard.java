package practice;

public class ChesBoard {
    public static void main(String[] args) throws InterruptedException {
        int n=1;
        int m=1;
        while (n<=8){
            while (m<=4) {
                if (n%2==0){
                    System.out.print("1  0  ");
                } else {
                    System.out.print("0  1  ");
                    Thread.sleep(300);
                }
                    m++;
            }
            System.out.println();
            m=1;
            n++;
        }
    }
}
