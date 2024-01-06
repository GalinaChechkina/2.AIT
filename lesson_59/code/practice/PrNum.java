package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrNum {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>(List.of(
                10,11,12,13,14,15,16,17,18,19,20
        ));
        System.out.println("Numbers: ");
        numbers.stream()
                .forEach(n-> System.out.print(n+" "));
        System.out.println();

        System.out.println("Prime Numbers: ");
        numbers.stream()
                .filter(n->isPrime(n))
                .forEach(n->System.out.print(n+" "));
        System.out.println();

        numbers.stream()
                .map(n->isPrime(n))
                .forEach(n->System.out.print(n+" "));
        System.out.println();

    }

    private static boolean isPrime(Integer n) {
        int i=2;
        while (i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }return true;
    }
}
