package practice.computer;

import practice.comp.model.Computer;
import practice.comp.model.Laptop;
import practice.comp.model.Smartphone;
import practice.ArrayMethods;

public class CastingAppl {
    public static void main(String[] args) {
        Computer lap1=new Laptop("i17",16,512, "Asus",3,2.1);
        System.out.println(lap1);
        ArrayMethods.split();
        if (lap1 instanceof Laptop) {
            Laptop laptop1 = (Laptop) lap1;//down casting from Computer to Laptop
            laptop1.setHours(4.5);
            System.out.println(laptop1);
            System.out.println(lap1);
        }
        ArrayMethods.split();
        Computer smart1=new Smartphone("Snapdragon",8,128,"Samsung", 24,
                0.15, 123456789098l);
        if (smart1 instanceof Smartphone) {
            Smartphone smartphone1 = (Smartphone) smart1;
            System.out.println(smartphone1.getImei());
        }
        ArrayMethods.split();
        if (lap1 instanceof Smartphone) {
            Smartphone smartphone2 = (Smartphone) lap1;
            System.out.println(smartphone2);
        } else {
            System.out.println("lap1 is not a smartphone!");
        }
        ArrayMethods.split();
    }
}
