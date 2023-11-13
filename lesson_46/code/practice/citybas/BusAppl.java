package practice.citybas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BusAppl {
    public static void main(String[] args) {

        //создать список городских маршрутов на основе автобусов из городского автопарка;

        List<Bus> cityBus = new ArrayList<>();
        cityBus.add(new Bus("M1", "n1", "A1", 10));
        cityBus.add(new Bus("M2", "n2", "N2", 20));
        cityBus.add(new Bus("M3", "n3", "B3", 30));
        cityBus.add(new Bus("M4", "n4", "4", 40));
        cityBus.add(new Bus("M5", "n5", "4", 50));
        cityBus.forEach(s -> System.out.println(s + " "));

        Bus bus = new Bus("M6", "n6", "6", 60);
        cityBus.add(bus);

        System.out.println("--------------Unsorted List-----------");
        cityBus.forEach(s -> System.out.println(s + " "));

        System.out.println(cityBus.size());
        System.out.println("Is empty? (true/false) " + cityBus.isEmpty());

        //System.out.println(cityBus); //это печать методом toString, реализованным в классе Bus

        cityBus.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("---------------Sorted List------------");
        cityBus.forEach(s -> System.out.println(s + " "));

        //подсчитать общую вместимость автобусов из автопарка.

        int totalCapacity = 0;
        for (Bus b : cityBus) {
            totalCapacity += b.getBusCapacity();
        }
        System.out.println("Total capacity is " + totalCapacity);

        Comparator<Bus> comparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2) {
                return o1.getBusCapacity() - o2.getBusCapacity();
            }
        };
        cityBus.sort(comparator);
        cityBus.forEach(s -> System.out.println(s + " "));
    }
}
