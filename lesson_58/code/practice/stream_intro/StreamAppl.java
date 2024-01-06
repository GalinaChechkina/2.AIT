package practice.stream_intro;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAppl {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>(List.of(1,9,2,8,3,7,4,6,5));
        numbers.stream()//open stream
                .filter(n->n>3) // filter by predicate
                .peek(n-> System.out.println("peak before sort: "+n)) // for debugging
                .sorted((n1,n2)->Integer.compare(n1,n2)) // sorted by comparator
                .forEach(System.out::println); // print by lambda-expression  terminal operation

        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer>integerStream= Arrays.stream(arr)
                .filter(n-> n>2)
                .filter(n->n%2==0)
                .sorted((n1,n2)->-Integer.compare(n1,n2));
                integerStream.forEach(s-> System.out.print(s+" ")); // terminal operation
        System.out.println();

        Integer res = Arrays.stream(arr)
                .map(n -> n * 10)//map- not Map
                .reduce(0, (accum, n) ->  accum + n);
        System.out.println("sum = " + res);

        String str = Arrays.stream(arr)
                .sorted()
                .map(Object::toString)
                .reduce("Result = ", (accum, n) ->  accum + n); // terminal operation

        System.out.println(str);

        String[]strarr={"a","b","c"};
        String res1=Arrays.stream((strarr))
                .map(s -> s+"1")
                .peek(n-> System.out.println(n))
                .reduce("",(acc,s)->acc+s); // terminal operation
        System.out.println("sum: "+res1);
//        Map<Integer,List<Programmer>>map= programmers.stream()
//                .collect(Collectors.groupingBy(p->p.getTechnologies().length));
//        Integer max=map.keySet().stream()
//                .max(Integer::compareTo).orElse(0);
//        map.get(max).forEach(System.out::println);

//        Map<String,List<String>> map= Stream.of("apple","apricot","banana","orange")
//                .collect(Collectors.g((s1,s2)->s1.substring(0,1).equalsIgnoreCase(s2.substring(0,1))));
//        Set<String>keys=map.keySet(); //все ключи
//        for (String s:keys ) {
//            System.out.println(s+" -> "+map.get(s));
        //}
    }
}
