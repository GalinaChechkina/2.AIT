package practice;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer>set= new java.util.TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println(set);
        Iterator<Integer>iterator= set.iterator();

        System.out.println(set.hashCode());

    }
}
