package practice.supermarkt;

import practice.ArrayMethods;
import practice.supermarkt.model.*;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] products=new Product[4];
        products[0]=new Product("Nivea",2311107311111L, 5.40);
        products[1]=new Food("Apple Gala",1029330509876L,2.50,"10.10.2023",true);
        products[2]=new MeatFood("Rewe Bio Steak",2100451112345L,25.50,"2.10.2023", false, "Fresh beef");
        products[3]=new MilkFood("Ja! Cream",1111234506061L,3,"15.10.2023", true,"Dairy",32);

        print(products);
        ArrayMethods.split();
        double sum=sumCalcul(products);
        System.out.println("Sum of prices: "+sum);


    }

    public static void print(Product[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
    public static double sumCalcul(Product[] products) {
        double s=0;
        for (int i = 0; i < products.length; i++) {
            s+=products[i].getPrice();
        }
        return s;
    }
}
