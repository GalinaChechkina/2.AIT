package practice.yachts.dao;

import practice.yachts.model.Yacht;

public interface Yachts {
    boolean add(Yacht yacht);
    void getYachtsByMaterial(String material);
    void getYachtsHigherPriced(int price);
    void getYachtsBetweenYears(int from, int to);
    void printList();
    void printSortedList();
    double avgPrice();
}
