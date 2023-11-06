package practice.calculator;

public class Calculator {
    //Реализовать 5 методов для калькулятора (сложение, вычитание, умножение, деление с остатком,
    //целая часть от деления), который работает с целыми числами. Покрыть все методы тестами.

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b) {
        int res=0;
        if (b == 0) {
            System.out.println("You can't divide by zero!");
        }else {
            res= a/b;
        }
        return res;
    }
    public int rest(int a, int b){
        int r=0;
        if(b==0){
            System.out.println("You can't divide by zero!");
        } else {
            r = a % b;
        }
        return r;
    }
}
