package practice.homework.country;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CountryAppl {
    public static void main(String[] args) {
        LinkedList<Country>cList=new LinkedList<>();
        cList.addFirst(new Country("Deutschland",83.2,"Eurasia"));
        cList.add(new Country("Ecuador",17.8,"South America"));
        cList.add(new Country("Ukraine",29,"Eurasia"));
        cList.add(new Country("Mexico",129.2,"North America"));
        cList.add(new Country("Kenya",57.9,"Africa"));
        cList.add(new Country("Australia",25.69,"Australia"));
        cList.add(new Country("Chile",19.49,"South America"));
        cList.add(new Country("Afghanistan",40.1,"Eurasia"));
        cList.add(new Country("Canada",38.25,"North America"));
        cList.add(new Country("Ghana",32.83,"Africa"));
        cList.addLast(new Country("Bangladesh",169.4,"Eurasia"));

        System.out.println("-----Unsorted List--------");
        cList.forEach(s-> System.out.println(s));
        System.out.println();

        System.out.println("-----Sorted List by name--------");
        cList.sort(Country::compareTo);//три варианта вызова встроенного кампаратора
        //Collections.sort(cList);
        //cList.sort((s1,s2)->s1.compareTo(s2));
        cList.forEach(s-> System.out.println(s));
        System.out.println();

        System.out.println("-----Sorted List by increasing population--------");
        Comparator<Country> comparatorP=new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare(o1.getPopulation(), o2.getPopulation());
            }
        };
        cList.sort(comparatorP);
        cList.forEach(s-> System.out.println(s));
        System.out.println();

        System.out.println("-----Sorted List by descending population--------");
        Comparator<Country> comparatorP1=new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare(o2.getPopulation(), o1.getPopulation());
            }
        };
        cList.sort(comparatorP1);
        cList.forEach(s-> System.out.println(s));
        System.out.println();

        System.out.println("-----Sorted List by continent and population--------");
        Comparator<Country>comparatorC=new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                int res= o1.getContinent().compareTo(o2.getContinent());
                return res!=0 ? res: Double.compare(o1.getPopulation(), o2.getPopulation());
            }
        };
        cList.sort(comparatorC);
        cList.forEach(s-> System.out.println(s));
    }
}
