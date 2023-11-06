package practice.computers;

import practice.ArrayMethods;
import practice.computers.model.Computers;
import practice.computers.model.Laptop;
import practice.computers.model.Smartphone;

public class ComputersAppl {
    public static void main(String[] args) {

        Computers[] comp=new Computers[4];
        comp[0]=new Computers("i9",16,512,"Asus");
        comp[1]=new Laptop("i5",8,256,"Acer","14",1000,2);
        comp[2]=new Laptop("M2",16,512,"MacBook","14",500,1);
        comp[3]=new Smartphone("A17 Pro",8,512,"iPhone 15 Pro","6.1",29,225,48);

        ArrayMethods.split();

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }
        ArrayMethods.split();

        int sumHdd=0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd=sumHdd+comp[i].getHdd();
        }
        System.out.println("Total sum Hdd: "+sumHdd);
    }
}
