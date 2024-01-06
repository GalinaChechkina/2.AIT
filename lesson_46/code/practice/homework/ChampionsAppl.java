package practice.homework;

import java.util.ArrayList;
import java.util.List;

public class ChampionsAppl {
    public static void main(String[] args) {
        List<Champions>champions;
        champions=new ArrayList<>();
        champions.add(new Champions(1,"A1","C1",random()));
        champions.add(new Champions(2,"A2","C2",random()));
        champions.add(new Champions(3,"A3","C3",random()));
        champions.add(new Champions(4,"A4","C4",random()));
        champions.add(new Champions(5,"A5","C5",random()));
        champions.add(new Champions(6,"A6","C6",random()));
        champions.add(new Champions(7,"A7","C7",random()));
        champions.add(new Champions(8,"A8","C8",random()));
        champions.add(new Champions(9,"A9","C9",random()));
        champions.add(new Champions(10,"A10","C10",random()));
        System.out.println("---------List of participants-----------");
        champions.forEach(s -> System.out.println(s + " "));
        System.out.println();
        System.out.println("----------Competition report-----------");
        champions.sort((s1,s2)-> s1.compareTo(s2));
        champions.forEach(s -> System.out.println(s + " "));
    }
    public static double random(){
        double res=Math.random()+9;
        return res;
    }
}
