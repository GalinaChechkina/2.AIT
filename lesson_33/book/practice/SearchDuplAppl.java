package practice;

import java.util.Arrays;
import java.util.Random;

//import static java.lang.StringLatin1.compareTo;

public class SearchDuplAppl {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];
        SearchDupl.fillArray(arr);
        SearchDupl.printArray(arr);

        Random random = new Random();
        int n = random.nextInt(101);
        System.out.println(n);

        Integer[] arr1 = SearchDupl.addNumber(arr, n);
        SearchDupl.printArray(arr1);

        /*Arrays.sort(arr1);
        SearchDupl.printArray(arr1);*/
        SearchDupl.searchDupl(arr1);

        //System.out.println("The desired duplicate is " + arr1[99]);

    }
}
