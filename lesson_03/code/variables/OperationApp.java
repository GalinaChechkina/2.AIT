package variables;

public class OperationApp {
    public static void main(String[] args) {

        //operations with integer numbers
        int x = 20; //так объявили переменную
        int y = 10;
        int z = x+y; //выполнили сложение
        System.out.println("X=20, Y=10");
        System.out.println("Sum (X,Y)=" +x+ "+" +y+ "=" +z);

        z = x*y;
        System.out.println("Mul (X,Y)=" +x+ "*" +y+ "=" +z);
    }
}
