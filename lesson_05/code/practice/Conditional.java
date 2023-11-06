package practice;

public class Conditional {
    public static void main(Stroka[] args) {
        int x = 0;
        if (x>0) {
            System.out.println("х- положительное");
        } else if (x==0) {
            System.out.println("x равен нулю");
        }
            else{
            System.out.println("х- отрицательное");
        }

        int a= 11;
        if (a%2==0) {
            System.out.println("а- четное");
        } else {
            System.out.println("a- нечетное");
        }

        int y =55;
        if (y>=18){
            System.out.println("Вам разрешено действовать самостоятельно");
        }
        else {
            System.out.println("Вам надо прийти с опекуном");
        }

        char n= 20;
        char m= 20;
        int res;
        if (n==m){
            res= (n+m)*5;
            System.out.println(res);

        } else {
            res= (n-m)*5;
            System.out.println(res);
        }
    }
}
