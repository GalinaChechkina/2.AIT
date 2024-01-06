package practice.recursion;

public class FibAppl {
    public static void main(String[] args) {

        int a=0;
        int b=1;
        int n=7;
        System.out.println(n+"-th element of the Fibonacci sequence: "+numFibonacci(n));
    }

    private static int numFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return numFibonacci(n-1)+numFibonacci(n-2);
        }
    }
}
