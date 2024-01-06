package practice.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Focus {
    public static void main(String[] args) {
        List<String>list;
        list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.forEach(s -> System.out.println(s+" "));
        System.out.println();
        System.out.println("------------------------");
        LinkedList<String>list1=focus(list);
        list1.forEach(s -> System.out.println(s+" "));
    }
    public static LinkedList<String> focus(List<String> list){
        LinkedList<String>list1=new LinkedList<>();
        int i=0;
        while (i< list.size()) {
            list1.add(i,list.get(list.size() - i - 1));
            i++;
        }
        return list1;
    }
}
