package practice;

public class SqEq {
    public static void main(Stroka[] args) {
        double a = 1;
        double b = -5;
        double c = 6;
        double d = dis(a, b, c);

        if (d < 0) {
            System.out.println("There are no roots");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("One roote " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Root1= " + x1);
            System.out.println("Root2= " + x2);
        }
    }
    public static double dis(double a, double b, double c){
        return b*b-4*a*c;
    }
}
