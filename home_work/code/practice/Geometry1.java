package practice;

public class Geometry1 {
    public static void main(String[] args) {
        double a = 5;
        double v = cubeVolume(a);
        double s = turnArea(a);
        System.out.println("Объем куба равен " +v);
        System.out.println("Площадь поверхности куба равна " +s);

        double b = 9;
        double h = 7;
        double st = triangleArea(b,h);
        System.out.println("Площадь треугольника равна " +st);

    }

    public static double cubeVolume(double a){
        return a*a*a;
    }

    public static double turnArea(double a){
        return 6*a*a;
    }

    public static double triangleArea(double b, double h){
        return 0.5*b*h;
    }
}
