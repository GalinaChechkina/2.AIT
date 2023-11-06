package practice.beverage;

import practice.ArrayMethods;
import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage b0=new Beverage();
        b0.displayStock();
        ArrayMethods.split();
        Beverage b1= new Beverage("Milk","box",10);
        b1.toBuy("Milk","box",20);
        b1.displayStock();
        ArrayMethods.split();

        Beer beer=new Beer();
        beer.displayStock();
        ArrayMethods.split();
        Beer b2= new Beer("Guinness","pack",10,"dark");
        b2.toBuy("Guinness","pack",10/*,"dark"*/);
        b2.displayStock();
    }
}
