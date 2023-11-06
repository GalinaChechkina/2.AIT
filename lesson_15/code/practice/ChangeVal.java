package practice;

public class ChangeVal {
    public static void main(String[] args) {
        int a=10;
        int b=45;
        System.out.println("a= "+a+";  b= "+b);
        change(a,b);
    }
    public static void change(int a, int b){
        int x=a;
        int y=b;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("a= "+x+";  b= "+y);
    }
}
