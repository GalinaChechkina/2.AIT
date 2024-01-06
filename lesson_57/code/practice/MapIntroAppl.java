package practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        //создаем Мар, отражающий количество людей в городах США
        Map<String,Integer>map=new TreeMap<>();
        map.put("Denver",600000);
        map.put("Boston",670000);
        map.put("Chicago",2700000);
        map.put("Atlanta",470000);
        map.put("New York",8500000);
        map.put("Dallas",1300000);

        System.out.println("Map size: "+map.size());
        System.out.println("Is empty? "+map.isEmpty());

        Integer num= map.get("Chicago");//получение значения по ключу
        System.out.println(num);
        int p=map.get("Atlanta");//значение вытянулось и в int
        System.out.println(p);

        System.out.println(map.containsKey("Boston"));//проверка ключа на наличие
        System.out.println(map.containsKey("Moscow"));//проверка ключа на наличие

        map.put("Chicago",2700001);//обновим значение по ключу
        System.out.println(num);//старое значение численности

        System.out.println(map.get("Chicago"));//новое значение численности


        Collection<Integer>population=map.values();//все значения
        int total=0;
        for (Integer i:population ) {
            total+=i;
        }
        System.out.println("Population: "+total);

        System.out.println("-----------Print map------------");
        Set<String>keys=map.keySet(); //все ключи
        for (String s:keys ) {
            System.out.println(s+" -> "+map.get(s));
        }

        System.out.println("-----------Print map2------------");
        Set<Map.Entry<String,Integer>>entries=map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        System.out.println("-----------Print map3------------");
        System.out.println(map.entrySet());
    }
}
