package practice;

public class Methods1 {
    public static void main(Stroka[] args) {
        int a, b;
        a=3;
        b=4;
        int c = hipotenusa(a, b);
        System.out.println("Квадрат гипотенузы равен " +c);

        int d = 46;
        int inv = smenaZnaka(d);
        System.out.println("Противоположное значение числа равно " +inv);

        int f = 20;
        int kub = cub(f);
        System.out.println("Куб числа равен " +kub);

    }
    public static int hipotenusa(int a, int b){
        return a*a+b*b;
    }

    public static int smenaZnaka(int d){
        return -d;
    }

    public static int cub(int f){
        return f*f*f;
    }

}
