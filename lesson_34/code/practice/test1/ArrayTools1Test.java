package practice.test1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.utils1.ArrayTools1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTools1Test {
    Integer[]arr;
    String[]arr1;

    @BeforeEach
    void setUp() {
        arr=new Integer[]{10,1,12,35,-4,5,16};
        arr1=new String[]{"b","a","d","ok"};

    }
    @Test
    void printArray(){
        System.out.println("======= test print array ======");
        ArrayTools1.printArray(arr);
        ArrayTools1.printArray(arr1);
    }

    @Test
    void search(){
        System.out.println("======= test search ======");
        int index= ArrayTools1.search(arr1,"ok");
        System.out.println("index= "+index);
        index= ArrayTools1.search(arr1,"8");
        System.out.println("index= "+index);
        index= ArrayTools1.search(arr,2);
        System.out.println("index= "+index);
        index= ArrayTools1.search(arr,8);
        System.out.println("index= "+index);
    }

    @Test
    void testFindByPredicate(){
        System.out.println("======= test by predicate ====");
        /*Predicate<Integer> predicate= new Predicate<Integer>(){  //создаем анонимный класс
            @Override
            public boolean test(Integer integer){
                return integer<5;
            }
        };*/

        // Predicate<Integer> predicate= (integer)-> integer<5;       //лямбда-выражение (укороченная запись в Java)

        Integer num=ArrayTools1.findByPredicate(arr,n->n<5);  // а так еще короче
        System.out.println(num);
        num=ArrayTools1.findByPredicate(arr,n->n%5==0);
        String str=ArrayTools1.findByPredicate(arr1,s -> s.length()==1);
        System.out.println(str);
    }

    @Test
    void testBubbleSort(){
        System.out.println("====== test bubble sort ======");
        ArrayTools1.bubbleSort(arr);
        ArrayTools1.printArray(arr);
        ArrayTools1.bubbleSort(arr1);
        ArrayTools1.printArray(arr1);
    }

    @Test
    void testBubbleSortComparator(){
        System.out.println("====== test bubble sort ======");
        ArrayTools1.bubbleSortComparator(arr,(n1,n2)->n1-n2);
        ArrayTools1.printArray(arr);
        ArrayTools1.bubbleSortComparator(arr1,(n1,n2)->n2.length()-n1.length());
        ArrayTools1.printArray(arr1);
    }

    @Test
    void testOddEvenComparator() {
        Integer[]origin={1,4,3,2,5,6,9,8,7,3};
        Comparator<Integer>comparator=(n1,n2)->{
           if(n1%2 == 0 && n2%2 !=0 ){
               return -1;
           }
           if(n1%2 != 0 && n2%2 ==0 ){
               return 1;
           }
           return 0;
        };
        Arrays.sort(origin,comparator);
        System.out.println(Arrays.toString(origin));
    }

    @Test
    void testOddEvenComparator1() {
        Integer[]origin={1,4,3,2,5,6,9,8,7,3};
        Comparator<Integer>comparator=(n1,n2)->{
            if(n1%2 == 0 && n2%2 !=0 ){
                return -1;  //не меняем объекты местами
            }
            if(n1%2 != 0 && n2%2 ==0 ){
                return 1;   //меняем объекты меcтами
            }
            if(n1%2 == 0 && n2%2 ==0 ) {
                return n1 - n2; //объекты поменяются, если n1 больше n2
            }
            return n2 - n1;     //объекты поменяются, если n2 больше n1
        };

        Arrays.sort(origin,comparator);
        System.out.println(Arrays.toString(origin));
    }

    @Test
    void testBinarySearchComparable(){
        Integer[]origin={1,4,3,2,5,6,9,8,7,3};
        Arrays.sort(origin);
        System.out.println(Arrays.toString(origin));
        int n=ArrayTools1.binarySearchComparable(origin,5);
        System.out.println("Index= "+n);
    }

    @Test
    void testBinarySearchCompartor(){
        Integer[]origin={1,4,3,2,5,23,6,9,8,7,3,-8};
        Arrays.sort(origin,(n1,n2)->n1-n2);
        System.out.println(Arrays.toString(origin));
        int n=ArrayTools1.binarySearchComparator(origin,0,(n1,n2)->n1-n2);
        System.out.println("Index= "+n);
    }
}