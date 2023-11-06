package practice.city.test_37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.city.model.City;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600000);
        cities[1] = new City("Boston", 670000);
        cities[2] = new City("Chicago", 2700000);
        cities[3] = new City("Atlanta", 470000);
        cities[4] = new City("New York", 8500000);
        cities[5] = new City("Dallas", 1300000);

    }

    private void printArray(Object[] arr, String title) {
        System.out.println("=========" + title + "=========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1));//в классе Integer тоже можно использовать компаратор для сравнения чисел
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCityComparable() {
        printArray(cities, "Original array");
        Arrays.sort(cities, (c1, c2) -> c1.getPopulation() - c2.getPopulation());//так сделала, т.к. в Comparable не получается сделать рабочим метод compareTo
        printArray(cities, "Natural order");
        City city = new City("Chicago", 2700000);
        int n = Arrays.binarySearch(cities, city,(c1, c2) -> c1.getPopulation() - c2.getPopulation());
        System.out.println(n);
    }

    @Test
    void testCityComparator() {
        //Comparator<City>comparator=(c1,c2)->c1.getName().compareTo(c2.getName());
        printArray(cities, "Original array");
        Arrays.sort(cities, (c1, c2) -> c1.getName().compareTo(c2.getName()));
        printArray(cities, "Sort by name");
        City city = new City("Chicago", 2700000);
        int n = Arrays.binarySearch(cities, city, (c1, c2) -> c1.getName().compareTo(c2.getName()));
        System.out.println(n);
    }

    @Test
    void testArrayCopy(){
        Comparator<City>comparator=(c1,c2)->c1.getName().compareTo(c2.getName());
        //City[]citiesCopy=cities;
        //printArray(citiesCopy,"CitiesCopy Beafor Sort");
        //Arrays.sort(citiesCopy,comparator);
        //printArray(cities,"CitiesCopy After Sort");

        City[]cities1=new City[cities.length];
        for (int i = 0; i < cities1.length; i++) {
            cities1[i]=cities[i];
        }
        // а можно так:

        City[]cities2=Arrays.copyOf(cities,cities.length);
        Arrays.sort(cities2,0,cities2.length-3,comparator);
        printArray(cities2,"Cities2");
        City city = new City("Chicago", 2700000);
        int n= Arrays.binarySearch(cities2,0,cities2.length-3,city,comparator);
        System.out.println(n);

        //printArray(cities1,"CitiesCopy Beafor Sort");
        //Arrays.sort(cities1,comparator);
        //printArray(cities1,"CitiesCopy After Sort");
        //printArray(cities,"City");
    }

    @Test
    void testCopyOfRange(){
        City[]citiesCopy=Arrays.copyOfRange(cities,1,cities.length+1);
        printArray(citiesCopy,"cities copy");
    }

    @Test
    void testSystemArrayCopy(){
        City[]citiesCopy=new City[cities.length*2];
        System.arraycopy(cities,1,citiesCopy,4,5);
        printArray(citiesCopy,"cities Copy");
    }

    @Test
    void testKeepSorted(){
        Arrays.sort(cities,(c1, c2) -> c1.getPopulation() - c2.getPopulation());
        printArray(cities, "Natural order");
        City city=new City("Salem",690000);
        City[]citiesCopy=Arrays.copyOf(cities,cities.length+1);

//      неверный путь
//        citiesCopy[citiesCopy.length-1]=city;
//        Arrays.sort(citiesCopy,(c1, c2) -> c1.getPopulation() - c2.getPopulation());
//        cities=citiesCopy;

        int index=Arrays.binarySearch(cities,city,(c1, c2) -> c1.getPopulation() - c2.getPopulation());
        index=index>=0? index:-index-1;
        System.arraycopy(citiesCopy,index,citiesCopy,index+1,citiesCopy.length-index-1);
        citiesCopy[index]=city;
        printArray(citiesCopy,"Natural order after add city");
    }

}