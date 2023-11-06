package practice.arrMet;

public class NumPrime {
    //  Для метода проверки, является ли число простым, написать тест.
    //  Использовать assert для логических выражений.

    public boolean numPr(int n) {
        boolean isPrime = true;
        if (n<=1){
            isPrime=false;
        }
        int d = 2;
        while (d < n) {
            if (n % d == 0) {
                isPrime = false;
            }
            d++;
        }
        System.out.println("The statement that the number " + n + " is Prime is " + isPrime);
        return isPrime;
    }
}
