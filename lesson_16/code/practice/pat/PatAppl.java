package practice.pat;

import practice.pat.model.Pat;

public class PatAppl {
    public static void main(String[] args) {
        Pat pat1=new Pat(1, "Cat",10,"Chloe");
        Pat pat2=new Pat(2, "Dog",3,"Max");
        Pat pat3=new Pat(3, "Hamster",1,"Milli");
        Pat pat4=new Pat(4, "Parrot",5,"Jack");
        Pat pat5=new Pat(5, "Horse",17,"Julius");

        pat1.display();
        pat2.display();
        pat3.display();
        pat4.display();
        pat5.display();

        System.out.println();
        Pat.split();

        pat1.sleep(pat1.getNickname());
        pat2.eat(pat2.getNickname());
        pat3.game(pat3.getNickname());
        pat4.sound(pat4.getNickname());
        pat5.walk(pat4.getNickname());

    }
}
