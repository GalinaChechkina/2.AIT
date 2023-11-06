package practice;

public class Dopolnit {
    public static void main(String[] args) {
        double a = 100;
        double s = change(a);
        System.out.println("У вас " +s+ " долларов");

        double b = 1000;
        double d = mera(b);
        System.out.println("Получилось " +d+ " метров");

        double k = 21;
        double p = okr(k);

        System.out.println("Всего было  " +p+ " поездок");

        double n = 49;
        double m = proezd(n,p);
        System.out.println("Стоимость одной поездки " +m);
    }
    public static double change(double a){
        return 1.07*a;
    }
    public static double mera(double b){
        return 0.3048*b;
    }

    public static double okr(double k){
        return 2*k+1.5*(30-k);
    }

    public static double proezd(double n, double p){
        return n/p;
    }
}
