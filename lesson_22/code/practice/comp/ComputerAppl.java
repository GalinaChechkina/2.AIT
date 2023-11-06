package practice.comp;

import practice.ArrayMethods;
import practice.comp.model.Computer;
import practice.comp.model.Laptop;
import practice.comp.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] shop = new Computer[4];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 4.5, 2.2);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);
        printArray(shop);
        ArrayMethods.split();

        Computer computer= new Computer("i5", 12, 512, "HP");
        boolean checker=shop[0].equals(computer);
        System.out.println(checker);
        ArrayMethods.split();
        checker=shop[1].equals(shop[2]);
        System.out.println(checker);
        ArrayMethods.split();
        Smartphone smartphone= new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789097l);
        checker=shop[3].equals(smartphone);
        System.out.println(checker);
    }
    public static void printArray(Computer[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
}

