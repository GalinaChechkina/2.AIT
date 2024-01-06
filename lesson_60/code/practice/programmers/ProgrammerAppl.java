package practice.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {

    //Необходимо ответить на вопросы
    //1. кто знает больше всего языков? (рейтинг программистов)
    //2. какие языки популярны у наших программистов? (рейтинг языков)

    public static void main(String[] args) {

        List<Programmer>programmers=getProgrammers();
        programmers.forEach(s-> System.out.println(s));

        System.out.println("----------Most skilled programmers---------");
        printMostSkilledProgrammers(programmers);

        System.out.println("----------Most popular technologies---------");
        printMostPopularTechnologies(programmers);
    }

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("----------Print all technologies---------");
        Iterable<String>technologies=programmers.stream()
                .map(p->p.getTechnologies())
                .flatMap(t->Arrays.stream(t))
                .collect(Collectors.toList()); //все языки засунули в список
        StreamSupport.stream(technologies.spliterator(),false)
                .distinct() //убрали дубликаты
                .forEach(System.out::println);
        System.out.println("-----Grouping by programmers");
        Map<String, Long> techFrequency=programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        System.out.println(techFrequency);
        Long max=techFrequency.values().stream()
                .max(Long::compare).orElse(0L);
        techFrequency.entrySet().stream()
                .filter(e->max.equals(e.getValue()))
                .forEach(e-> System.out.println(e));
    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer,List<Programmer>>map= programmers.stream()
                .collect(Collectors.groupingBy(p->p.getTechnologies().length));
        Integer max=map.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        map.get(max).forEach(System.out::println);

//        Map<Integer,List<Programmer>>map=new HashMap<>();
//        int max=0;
//        for (Programmer p:programmers) {
//            int key = p.getTechnologies().length;//количество языков, которые знает программист
//            max = key > max ? key : max;//обновили максимум, если нашелся больший
//            //Math.max(max,key);
//            map.putIfAbsent(key, new ArrayList<>());//если ключ встретился первый раз, то создаем пустой лист
//            List<Programmer> list = map.get(key);
//            list.add(p);
//        }
//            Set<Integer>keys=map.keySet(); //все ключи
//            for (Integer k:keys ) {
//                System.out.println(k + " -> " + map.get(k));
//            }
        }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter","C++","Python","Java","Kotlin"),
                new Programmer("John","Python","Java"),
                new Programmer("Helen","Kotlin","Scala","Java","JavaScript"),
                new Programmer("Jacob","Python","Go"),
                new Programmer("Michail","Fortran","Algol","PL-1")
        );
    }
}
