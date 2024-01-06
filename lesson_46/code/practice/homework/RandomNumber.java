package practice.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10) + 1);
        }
        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        for (Integer element : list) {
            if (!list1.contains(element)) {
                list1.add(element);
            }
        }
        System.out.println(list1);
    }
}
