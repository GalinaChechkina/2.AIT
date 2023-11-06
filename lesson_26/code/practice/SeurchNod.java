package practice;

public class SeurchNod {
//  Реализовать метод для нахождения наибольшего общего (НОД) делителя двух натуральных чисел.
//  Затем реализовать приложение, в которое передаются два числа в качестве параметров командной строки,
//  а оно возвращает их НОД.
    public int nod (Integer a, Integer b) {
    Integer nod=1;
    Integer min;
        if (a < b) {
        min = a;
    } else {
        min = b;
    }
    Integer res = 0;
        while (nod <= min) {
        if (a % nod == 0 && b % nod == 0) {
            res = nod;
        }
        nod++;
    }
        return res;
    }
}