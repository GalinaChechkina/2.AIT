public class Metod {
    public static void main(String[] args) {
        metod_1();
    }
    public static void metod_1(){
        System.out.println("I am the First:");
        System.out.println("          - I am calling the Second");
        System.out.println("          - First step finished!");
        metod_2();
    }
    public static void metod_2(){
        System.out.println("I am the Second:");
        System.out.println("          - I am calling the Third");
        System.out.println("          - Second step finished!");
        metod_3();
    }
    public static void metod_3(){
        System.out.println("I am the Third:");
        System.out.println("          - Вызываю ОРЛА!");
        System.out.println("          - Third step finished!");
    }
}
