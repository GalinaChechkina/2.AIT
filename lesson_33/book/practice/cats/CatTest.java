package practice.cats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[]c; //создали массив кошечек

    @BeforeEach
    void setUp() {
        c=new Cat[4];
        c[0]=new Cat(101,"Tim","British",5,3.5);
        c[1]=new Cat(102,"Jenny","Sphinx",1,1.2);
        c[2]=new Cat(103,"Chloe","Persian",9,5);
        c[3]=new Cat(104,"Mot","Maine Coon",2,8.5);
    }

    @Test
    void testCatSort(){
        System.out.println("========== Cat Array ==========");
        printArray(c);  //не отсортированный
        System.out.println();

        System.out.println("========== Sort by age ===========");
        Arrays.sort(c); //выполнили сортировку по возрасту
        printArray(c);
    }

    @Test
    void testCatSortComparator(){
        System.out.println("========== Sort by name ===========");
        Comparator <Cat> catComparator= new Comparator <Cat> () {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());//сравнили по имени
             // return o1.getAge()-o2.getAge();//сравнили по возрасту
             // (вычитание, т.к. возраст- int-ая переменная)
            }
        };
        Arrays.sort(c, catComparator); //выполнили сортировку по имени
        printArray(c);
    }

    @Test
    void testCatSortComparator2(){
        System.out.println("========== Sort by breed ===========");
        Comparator<Cat> catComparator=new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getBreed().compareTo(o2.getBreed());//сравнили по породе
            }
        };
        Arrays.sort(c, catComparator); //выполнили сортировку по породе
        printArray(c);
    }

    public void printArray(Object[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}