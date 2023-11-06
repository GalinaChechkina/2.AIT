package practice.supermarkt.dao;

import practice.ArrayMethods;
import practice.supermarkt.model.Food;
import practice.supermarkt.model.Product;

public class SupermarketAppl {
    public static void main(String[] args) {
        Supermarket kiosk= new Supermarket(4);
        kiosk.addProduct(new Product("Gift card",1000,20));
        kiosk.addProduct(new Food("Sosages",2000,5,"20.10.2023",false));
        kiosk.addProduct(new Food("Goat cheese",3000,13,"31.12.2023",true));
        kiosk.addProduct(new Food("Pork fat",4000,3,"15.11.2023",true));

        kiosk.printAllProducts();
        ArrayMethods.split();
        int p= kiosk.getQuantity();
        System.out.println(p);

        boolean ch=kiosk.removeProduct(4000);
        System.out.println(ch);
        kiosk.printAllProducts();
        int k= kiosk.getQuantity();
        System.out.println(k);
        ArrayMethods.split();

        boolean check =kiosk.addProduct(new Product("Book",5000,20));
        System.out.println(check);
        Product product= kiosk.findProduct(2000);
        System.out.println(product);

        ArrayMethods.split();
        kiosk.updateProduct(1000,30);
        kiosk.printAllProducts();

        ArrayMethods.split();
        kiosk.removeProduct(5000);
        kiosk.printAllProducts();
        int n= kiosk.getQuantity();
        System.out.println(n);

    }
}
