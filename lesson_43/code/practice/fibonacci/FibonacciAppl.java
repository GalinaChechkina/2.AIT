package practice.fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci(8);
        //TODO распечатать первые восемь чисел из ряда Ф:0,1,2,3,5,8,13,21
        printFibNum(fibonacci);

        //TODO сложить эти числа
        int sum= sumFibNum(fibonacci);
        System.out.println("Sum Fibonacci numbers:   "+sum);
    }

    public static void printFibNum(Fibonacci fibonacci){
        System.out.print("Fibonacci sequence:   ");
        for (int n: fibonacci) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
    public static int sumFibNum(Fibonacci fibonacci){
        int res = 0;
        for (int n: fibonacci) {
            res += n;
        }
        return res;
    }
}
