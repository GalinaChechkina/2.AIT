package practice;

public class Triangle {
    public static void main(String[] args) {
        int a= 11;
        int b= 32;
        int c= 63;
        if (a<b+c && b<a+c && c<a+b) {
            System.out.println("Triangle exists!!!");
        } else {
            System.out.println("Triangle doesn't exist :(");
        }
    }
}
