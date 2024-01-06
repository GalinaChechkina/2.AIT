package practice.homework;

import java.util.*;

public class UniqueList {
    public static void main(String[] args) {
      // Даны два списка неуникальных целых чисел или слов.
      // Посчитайте, сколько уникальных элементов содержится одновременно,
      // как в первом, так и во втором списке.

        List<Integer>list1=new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(5);
        list1.add(0);
        list1.add(-76);
        list1.add(32);
        list1.add(-27);
        list1.add(15);
        list1.add(2);
        list1.add(0);
        list1.add(15);

        List<Integer>list2=new ArrayList<>();
        list2.add(-76);
        list2.add(0);
        list2.add(15);
        list2.add(17);
        list2.add(-70);
        list2.add(382);
        list2.add(-227);
        list2.add(415);
        list2.add(9);
        list2.add(10);
        list2.add(15);

        ArrayList<String>list3=new ArrayList<>(Arrays.asList("a","b","c","d"));//создаем лист сразу
        ArrayList<String>list4=new ArrayList<>(Arrays.asList("a","ba","cd","od"));
        System.out.println(list3.retainAll(list4));
        System.out.println(list1.retainAll(list2));

        Set<Integer>integerSet=new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            integerSet.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            integerSet.add(list2.get(i));
        }
        System.out.println("Unique elements: "+integerSet);
    }
}
