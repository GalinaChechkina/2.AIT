package practice.yachts.dao;

import practice.yachts.model.Yacht;

import java.util.*;

public class YachtsImpl implements Yachts {
    List<Yacht> yachts;

    public YachtsImpl() {//конструктор для заполнения нашего списка
        yachts = new ArrayList<>();
        yachts.add(new Yacht("S", 2000,10,"wood",400000));
        yachts.add(new Yacht("F", 2023,80,"steel",24000000));
        yachts.add(new Yacht("S", 2015,50,"aluminium",1450000));
        yachts.add(new Yacht("S", 2019,35,"composite",3560000));
        yachts.add(new Yacht("S", 2022,7,"fiberglass",600000));
        yachts.add(new Yacht("S", 2006,50,"steel",400000));
        yachts.add(new Yacht("S", 1879,25,"wood",5400000));
        yachts.add(new Yacht("S", 1976,5,"wood",3500));
    }
    @Override
    public boolean add(Yacht yacht){
        if(yacht==null|| yachts.contains(yacht)) {
            return false;
        }
            return yachts.add(yacht);
    }

    @Override
    public void getYachtsByMaterial(String material) {
        yachts.stream().
                filter(p->p.getMaterial().equalsIgnoreCase(material))
                .forEach(s-> System.out.println(s));
    }

    @Override
    public void getYachtsHigherPriced(int price) {
        yachts.stream()
                .filter(p->p.getPrice()>price)
                .forEach(System.out::println);
    }

    @Override
    public void getYachtsBetweenYears(int from, int to) {
        yachts.stream()
                .filter(p->p.getYear() >= from && p.getYear() <= to)
                .forEach(System.out::println);
    }

    @Override
    public void printList() {
        yachts.stream().forEach(s-> System.out.println(s));
    }

    @Override
    public double avgPrice() {
        return  yachts.stream().mapToDouble(t->t.getPrice()).average().getAsDouble();
    }

    @Override
    public void printSortedList(){
        yachts.stream().sorted()
                .forEach(System.out::println);
    }
}
