public class Circus {
    public static void main(String[] args) {
        lightOn();
        entertainer();
        lightOff();
    }
    public static void lightOn(){
        System.out.println("Lights on!");
    }

    public static void entertainer(){
        jogger();
        singer();
        cloun();
    }

    public static void lightOff(){
        System.out.println("Lights off!");
    }

    public static void jogger(){
        System.out.println("My name is John");
        System.out.println("I'm jogger");
    }

    public static void singer(){
        System.out.println("My name is Pill");
        System.out.println("I'm singer");
    }

    public static void cloun() {
        System.out.println("My name is Oleg");
        System.out.println("I'm cloun");
    }
}
