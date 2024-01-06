package practice.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet>list;
        list=new ArrayList<>();
        list.add(new Planet("Neptune",30.5,17000,14));
        list.add(new Planet("Uran",19.22,14500,27));
        list.add(new Planet("Saturn",9.58,95000,83));
        list.add(new Planet("Jupiter",5.2,318000,79));
        list.add(new Planet("Mars",1.52,0.107,2));
        list.add(new Planet("Earth",1,1,1));
        list.add(new Planet("Venus",0.72,0.815,0));
        list.add(new Planet("Mercury",0.39,0.055,0));
        list.forEach(s -> System.out.println(s + " "));
        System.out.println();

        System.out.println("------------Sort by distance of the Sun------------");
        list.sort((s1,s2)-> s1.compareTo(s2));
        list.forEach(s -> System.out.println(s + " "));

        Comparator<Planet>comparatorName=new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("------------Sort by Name-----------------");
        list.sort(comparatorName);
        list.forEach(s -> System.out.println(s + " "));
        System.out.println();

        Comparator<Planet>comparatorWeight=new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };
        System.out.println("------------Sort by weight------------");
        list.sort(comparatorWeight);
        list.forEach(s -> System.out.println(s + " "));
        System.out.println();

        Comparator<Planet>comparatorSat=new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getNumSat()- o2.getNumSat();
            }
        };
        System.out.println("------------Sort by number of satellites---------");
        list.sort(comparatorSat);
        list.forEach(s -> System.out.println(s + " "));
    }
}
