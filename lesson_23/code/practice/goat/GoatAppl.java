package practice.goat;

import practice.ArrayMethods;
import practice.goat.model.Goat;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goatling1= new Goat("Петя");
        for (int i = 0; i < 10; i++) {
            goatling1.increment(); //если поле объекта static, то обращение к объекту возможно через имя класса
        }
        System.out.println(goatling1);

        Goat goatling2= new Goat("Bася");
        for (int i = 0; i < 15; i++) {
            goatling2.increment();;
        }
        System.out.println(goatling2);
        ArrayMethods.split();
        System.out.println(Goat.count_max);
        System.out.println(Math.PI);
    }
}
