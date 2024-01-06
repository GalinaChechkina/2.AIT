package practice.homework;

import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {

        //Node<String> city;

        LinkedList<String> list=new LinkedList<String>();//завела linkedlist
        list.addFirst("Hamburg");                     //добавила столицы федеральных земель
        list.add("Wiesbaden");
        list.add("Stuttgart");
        list.add("Munchen");
        list.add("Berlin");
        list.add("Potsdam");
        list.add("Bremen");
        list.add("Schwerin");
        list.add("Hannover");
        list.add("Dusseldorf");
        list.add("Mainz");
        list.add("Saarbrucken");
        list.add("Magdeburg");
        list.add("Kiel");
        list.add("Erfurt");
        list.addLast("Dresden");

        //System.out.println(list);                      //пробовала разные способы печати
        //list.forEach(s-> System.out.println(s));

        list.add(8,"-----Frankfurt am Main-----");//добавила Франкфурт в середину
        list.forEach(s-> System.out.println(s));         //распечатала лист с Франкфуртом
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println(list.get(3));                       //посмотрела, какой элемент находится под третьим индексом
        System.out.println(list.indexOf("Kiel"));              //посмотрела, какой индекс у элемента
    }
}
