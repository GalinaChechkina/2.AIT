package practice.yachts;

import practice.yachts.dao.Yachts;
import practice.yachts.dao.YachtsImpl;
public class YachtsAppl {
    public static void main(String[] args) {

        Yachts yachts=new YachtsImpl();
        yachts.printList();
        System.out.println("---------------------------");
        yachts.getYachtsByMaterial("wood");
        System.out.println("---------------------------");
        yachts.getYachtsHigherPriced(1000000);
        System.out.println("---------------------------");
        yachts.getYachtsBetweenYears(1900,2000);
        System.out.println("---------------------------");
        yachts.printSortedList();
        System.out.println("---------------------------");
        System.out.println("Average price: "+yachts.avgPrice());
    }
}
