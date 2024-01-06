package practice.tourists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class TravelAppl {
    public static void main(String[] args) {

        //кто посетил больше стран
        //какие страны более популярны

        List<Tourist> tourists=getTourists();
        tourists.forEach(s-> System.out.println(s));

        printMostSkilledTourists(tourists);
        printMostPopularCountries(tourists);
    }
    private static void printMostPopularCountries(List<Tourist> tourists) {

        System.out.println("\n----------Print all countries---------");

        // у нас список языков был Iterable, но можно просто List

         List<String>list =tourists.stream()
                .map(p->p.getCountries())
                .flatMap(t-> Arrays.stream(t))
                .distinct()  // убрали дубликаты
                .collect(Collectors.toList());   // сложили страны в список
        list.forEach(s-> System.out.print(s+"  "));
        System.out.println();

        System.out.println("\n---------Grouping by tourist visits------");

        Map<String, Long> map=tourists.stream()  // ключ- это страна, значение- сколько раз ее посетили
                .map(Tourist::getCountries) // взяли у объекта поле countries[]
                .flatMap(Arrays::stream) // достали из массива страны
                .collect(Collectors.groupingBy(t->t,Collectors.counting())); // сформировали map

        map.entrySet().stream() // запустили стрим Мар для ее печати
                        .forEach(s-> System.out.println(s));
        //System.out.println(map); //тоже печать, но в строку

        System.out.println("\nMost popular countries: ");
        Long max=map.values().stream() // стрим значений Мар
                .max(Long::compare).orElse(0L);

        map.entrySet().stream() // запустили стрим Мар
                .filter(e->max.equals(e.getValue())) // ищем элементы с мах значением
                .forEach(e-> System.out.println(e)); // выводим их на печать
    }
    private static void printMostSkilledTourists(List<Tourist> tourists) {
        System.out.println("\nMost skilled tourists: ");
        Map<Integer,List<Tourist>> map= tourists.stream()
                .collect(Collectors.groupingBy(p->p.getCountries().length));
        Integer max=map.keySet().stream()
                .distinct()
                .max(Integer::compareTo).orElse(0);
        map.get(max).forEach(System.out::println);
    }
    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins","Italy","Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B","Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina","Italy","France","Italy"),
                new Tourist("Anatoly","Montenegro","Albania","Greece","Italy"),
                new Tourist("Andrii", "UK","Ireland","Spain"),
                new Tourist("Liubov", "Croatia", "Slovenia", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }
}
