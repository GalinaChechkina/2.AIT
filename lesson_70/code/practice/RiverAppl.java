package practice;

import java.util.*;
import java.util.TreeSet;

public class RiverAppl {
    public static void main(String[] args) {
        River[]rivers=new River[6];
        rivers[0]=new River("Lech",3000,"Europe");
        rivers[1]=new River("Thames",3460,"Europe");
        rivers[2]=new River("Isar",2900,"Europe");
        rivers[3]=new River("Amazon",7062,"South America");
        rivers[4]=new River("Nile",6650,"Africa");
        rivers[5]=new River("Mississippi",3770,"North America");

        int sum= Arrays.stream(rivers)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .sum();
        System.out.println("Sum of lengths: "+ sum);

        OptionalInt max= Arrays.stream(rivers)
                .filter(Objects::nonNull)
                .mapToInt(River::getLength)
                .max();
        System.out.println("Max lengths of river: "+ max.getAsInt());

        Arrays.sort(rivers);
        for (int i = 0; i < rivers.length; i++) {
            System.out.println(rivers[i]);
        }
        System.out.println();
        Comparator<River>comparatorL=Comparator.comparing(River::getLength);
        Arrays.sort(rivers,comparatorL);
        for (River r:rivers){
            System.out.println(r);
        }
        System.out.println();

        List<River> list= new ArrayList<>(List.of(
                new River("Ob", 6500, "Asia"),
                new River("Amazon", 6575, "South America"),
                new River ("Dnieper", 2201, "Europe")
        ));

        Collections.addAll(list,rivers);
        System.out.println(list.size());
        Collections.sort(list);
        list.stream()
                .forEach(System.out::println);
        Collections.addAll(list,rivers);//задвоили лист
        list.forEach(System.out::println);
        System.out.println("-------------------------------------");

        Set<River>set=new TreeSet<>(list);//добавляем лист в Set (хотим сортированный список)
        //set.addAll(list);//добавляем лист в Set второй способ
        set.add(new River("Amazon", 6575, "South America"));
        set.add(new River("Murray", 2520, "Australia"));
        set.add(new River("Ice River", 1800, "Antarctica"));
        set.add(new River("Yangtze", 6380, "Asia"));
        set.add(new River("Seine", 776, "Europe"));
        set.add(new River("Congo", 4700, "Africa"));
        set.add(new River("Yenisei", 5542, "North America"));
        set.add(new River("Orinoco", 2140, "South America"));

        set.forEach(System.out::println);
        System.out.println(set.size());
        System.out.println("-------------------------------------");

        Map<String,Integer>map=new TreeMap<>(); // ключ-континент, значение- количество рек
        for (River r:set){
            String cont= r.getContinent();//определили ключ
            map.put(cont,map.getOrDefault(cont,0)+1);//кладем континенты в Мар по ключу континент, если этот континент уже есть, то добавляем к значению 1
        }
        for (Map.Entry<String,Integer>entry: map.entrySet()){
            System.out.println("Continent: "+entry.getKey()+" | Number of rivers: "+entry.getValue());
        }
    }
}
