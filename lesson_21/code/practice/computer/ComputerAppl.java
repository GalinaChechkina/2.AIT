package practice.computer;

import practice.comp.model.Smartphone;
import practice.comp.model.Computer;
import practice.comp.model.Laptop;
import practice.ArrayMethods;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] shop = new Computer[4];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        shop[0].setRam(24);
        shop[2] = new Laptop("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);

        printArray(shop);

        int total = getTotalSSDCapacity(shop);
        System.out.println("Total SSD capacity= " + total);

        ArrayMethods.split();
        double totalHours = getTotalHours(shop);
        System.out.println("Total hours= " + totalHours);
        ArrayMethods.split();

        int res=getLaptopSSDCapacity(shop);
        System.out.println("Total laptop ssd capacity= "+res);
        ArrayMethods.split();

        Laptop laptop1 = (Laptop) shop[1];
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);
    }


    public static void printArray(Computer[]arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

    public static int getTotalSSDCapacity(Computer[]arr){
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }

    public static double getTotalHours(Computer[]arr){
        double res=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                res+= ((Laptop) arr[i]).getHours();
            }
        }
        return res;
    }

    public static int getLaptopSSDCapacity(Computer[]arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop && !(arr[i] instanceof Smartphone)) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }
}

