package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionMethod {
    // Создайте список известных вам фруктов.
    // Выполните поиск имеющегося и отсутствующего элемента списка.
    // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
    // Проверьте работу методов
    // max(Collection<?> coll)
    // min(Collection<?> coll), что они возвращают?
    public static void main(String[] args) {
        List<String>fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("plum");
        fruits.add("strawberry");
        fruits.add("kiwi");
        for (String f:fruits ) {
            System.out.println(f);
        }
        System.out.println(Collections.binarySearch(fruits,"banana"));
        System.out.println("-------------------");
        Collections.sort(fruits);//взял compareTo-дефолтный метод у классa String
        for (String f:fruits ) {
            System.out.println(f);
        }
        System.out.println("-------------------");
        System.out.println(Collections.binarySearch(fruits,"banana"));// return index
        System.out.println(Collections.binarySearch(fruits,"blueberry"));

        Comparator<String>comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);//sort alphabet reverse order
            }
        };

        Collections.sort(fruits,comparator);
        for (String f:fruits ) {
            System.out.println(f);
        }
        System.out.println("-------------------");
        Collections.reverse(fruits);
        for (String f:fruits ) {
            System.out.println(f);
        }
        System.out.println("-------------------");

        System.out.println(Collections.min(fruits));
        System.out.println(Collections.max(fruits));

        System.out.println(Collections.min(fruits,comparator));
        System.out.println(Collections.max(fruits,comparator));

    }
}
