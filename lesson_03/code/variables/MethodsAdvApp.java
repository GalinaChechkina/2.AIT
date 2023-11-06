package variables;

public class MethodsAdvApp {

    public static void main(String[] args) {

        double constanta = pi();
        System.out.println(constanta);

        double res = circleLenght(10);
        System.out.println("L=" + res);

        double sC = circleArea(10);
        System.out.println("Sc=" + sC);

        double sS = squareArea(20);
        System.out.println("Ss=" + sS);

        double sR = rectangleArea(30,40);
        System.out.println("Sr=" + sR);

    }

        public static double circleLenght(double r){  //длина окружности L= 2*Pi*r
            return  2 * pi() * r;
        }

        public static double circleArea(double r) {  //площадь круга S= Pi*r*r
            return pi() * r * r;
        }

        public static double squareArea(double side) {  //площадь квадрата S= a*a
            return side * side;
        }

        public static double rectangleArea(double a, double b) {  //площадь прямоугольника S= a*b
            return a * b;
        }



        public static void printPi(double p) {
            System.out.println("pi=" + p);
        }
        public static double pi() {
            double pi = 3.1416926;
            return pi;
        }


}
