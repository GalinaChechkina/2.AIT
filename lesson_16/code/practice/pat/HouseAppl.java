package practice.pat;

import practice.pat.model.Cat;
import practice.pat.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {
        Cat c1=new Cat(1,"Cat",1,"Sam","Siberian",0.5,4);
        Cat c2=new Cat(2,"Cat",2,"Molly","Persian",0.4,3);
        Cat c3=new Cat(3,"Cat",13,"Vasily","Cur",0.7,6);
        Dog d1=new Dog(1,"Dog",8,"Marly","Retriever",1.2,20);
        Dog d2=new Dog(2,"Dog",5,"Lucky","Cur",0.4,3);

        System.out.println("Who is living in our house:");
        c1.display();
        c2.display();
        c3.display();
        d1.display();
        d2.display();

        System.out.println("Morning:");
        c1.eat(c1.getNickname());
        c2.sound(c2.getBreed(), c2.getTyp(), c2.getNickname());
        c3.sleep(c3.getNickname());
        d1.sound(d1.getBreed(), d1.getTyp(), d1.getNickname());
        d2.sound(d2.getBreed(), d2.getTyp(), d2.getNickname());
        d1.walk(d1.getNickname());
        d2.walk(d2.getNickname());

        System.out.println("Day:");
        c1.sleep(c1.getNickname());
        c2.sleep(c2.getNickname());
        c3.eat(c3.getNickname());
        c3.sleep(c3.getNickname());
        d1.sleep(d1.getNickname());
        d2.sleep(d2.getNickname());

        System.out.println("Evening:");
        c1.game(c1.getNickname());
        c2.walk(c2.getNickname());
        c3.sleep(c3.getNickname());
        d1.eat(d1.getNickname());
        d2.eat(d2.getNickname());
        d1.sound(d1.getBreed(), d1.getTyp(), d1.getNickname());
        d1.walk(d1.getNickname());
        d2.walk(d2.getNickname());
        d2.game(d2.getNickname());

        System.out.println("Night:");
        c1.sound(c1.getBreed(), c1.getTyp(), c1.getNickname());
        c2.sound(c2.getBreed(), c2.getTyp(), c2.getNickname());
        c3.walk(c3.getNickname());
        d1.sound(d1.getBreed(), d1.getTyp(), d1.getNickname());
        d2.sound(d2.getBreed(), d2.getTyp(), d2.getNickname());
        d1.game(d1.getNickname());
        d2.game(d2.getNickname());


    }
}
