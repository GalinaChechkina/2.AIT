package practice;

import java.util.*;

public class WordFreqAppl {
    public static void main(String[] args) {
        String[]words={"abc","ab","limit","ab","a","ab","limit"};
        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String[] words) {
        Map<String,Integer>resMap=new HashMap<>();
        for (String s:words) {
            if(!resMap.containsKey(s)) {//такое слово еще не встречалось, то
            resMap.put(s,1);                //пишем в map слово и 1
            }else {
                resMap.put(s, resMap.get(s) + 1);
            }
        }
        Set<Map.Entry<String,Integer>>entries=resMap.entrySet();
        System.out.println("------------Unsorted--------------");
        for (Map.Entry<String,Integer>entry:entries) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("------------Sort by repetitions amount  --------------");
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        list.forEach(e -> System.out.println(e));

        System.out.println("------------Sort alphabetically by name--------------");
        list.sort((e1, e2) ->e1.getKey().compareTo(e2.getKey()));
        list.forEach(e -> System.out.println(e));
    }
}
