package practice.test_35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.soldier.model.Soldier;

import java.util.Arrays;

public class ArrayTest_35 {
    Integer[]arr;
    String[]arr1;
    Soldier[]soldiers;

    @BeforeEach
    void setUp() {
        arr=new Integer[]{10,1,12,35,-4,5,16};
        arr1=new String[]{"b","a","d","ok"};
        soldiers=new Soldier[]{
                new Soldier("Petya",182,90,91),
                new Soldier("Vasya",175,83,83),
                new Soldier("Alex",162,75,83),
                new Soldier("Nastya",159,55,95),
                new Soldier("Anna",162,45,75),
        };
    }

    @Test
    void testArraysSort(){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    @Test
    void testArraysSortComparator(){
        Arrays.sort(arr,(n1,n2)->n2-n1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr1,(s1,s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    void testSortSoldiersNaturalOrder(){
        Arrays.sort(soldiers);
        printArray(soldiers);
        System.out.println(soldiers[0].compareTo(soldiers[2]));
    }

    @Test
    void testSortSoldiersByName(){
        Arrays.sort(soldiers,(s1,s2)->s1.getName().compareTo(s2.getName()));
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfile(){
        Arrays.sort(soldiers,(n1,n2)-> {
            int res=n2.getProfile()-n1.getProfile();
            return res!=0 ? res: n1.getName().compareTo(n2.getName());//если профили разные, то возвращаем сравнение по профилю. Если профили одинаковые, то сравниваем по росту
        });                                                           //использовали тернарный оператор
        printArray(soldiers);
    }

    @Test
    void testSoldierByWeight(){  //или можно вызвать метод compare во Wrapper классе Double
            //Arrays.sort(soldiers,(s1,s2)->Double.compare(s1.getWeight(), s2.getWeight()));

        Arrays.sort(soldiers,(s1,s2)->{
            double res= s1.getWeight()- s2.getWeight();
            if(res<0){
                return -1;
            }
            if(res>0){
                return 1;
            }
            return 0;
        });
        printArray(soldiers);
    }

    private void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===================================");
    }
}
