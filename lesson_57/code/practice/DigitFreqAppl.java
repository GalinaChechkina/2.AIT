package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitFreqAppl {
    public static void main(String[] args) {

        int[]num= generation(1000000);
        Map<Integer,Integer>df=frequencyDigits(num);
        printMap(df);
        Map<Integer,Integer>df1=frequencyDigits(num);
        printMap(df1);
    }

    private static void printMap(Map<Integer, Integer> map) {
        System.out.println("Frequency of occurrence of digits in array numbers: ");
        for (Map.Entry<Integer,Integer> e:map.entrySet()) {
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }

    private static Map<Integer,Integer> frequencyDigits(int[]arr) {//перевели массив в массив с цифрами
        Map<Integer,Integer>map=new HashMap<>();
        for (Integer num:arr) {
            while (num>0){
                int d=num%10;
                map.put(d,map.getOrDefault(d,0)+1);
                num=num/10;
            }
        }
        return map;
    }
    //String[] digits = num.toString().split("");- если хотим перевести в String
    private static Map<String,Integer> frequencyDigits1(int[]arr) {//перевели массив в массив со строками
        String[] digits = arr.toString().split("");
        Map<String,Integer>map=new HashMap<>();
        for (String s:digits) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }
    private static int[] generation(int n) {
        Random random=new Random();
        int min=1;
        int max=Integer.MAX_VALUE;
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt((max + 1) - min) + min;
        }
        return arr;
    }
    
    
}
