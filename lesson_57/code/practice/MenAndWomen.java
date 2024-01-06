package practice;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {
    public static void main(String[] args) {
        //посчитать количество М и Ж в нашей группе
        System.out.println("Group List with gender: ");
        Map<String,String>groupMapGender=new HashMap<>();
        groupMapGender.put("Leonid","male");
        groupMapGender.put("Galina","female");
        groupMapGender.put("Sergey1","male");
        groupMapGender.put("Irina","female");
        groupMapGender.put("Anton","male");
        groupMapGender.put("Andreas","male");
        groupMapGender.put("Anatoly","male");
        groupMapGender.put("Olesya","female");
        groupMapGender.put("Karolina","female");
        groupMapGender.put("Vladislava","female");
        groupMapGender.put("Alex","male");
        groupMapGender.put("Sasha","male");
        groupMapGender.put("Kirill","male");
        groupMapGender.put("Kirill1","male");
        groupMapGender.put("Victor","male");
        groupMapGender.put("Ivan","male");
        groupMapGender.put("Artem","male");
        groupMapGender.put("Tatyana","female");
        groupMapGender.put("Elena","female");
        groupMapGender.put("Lubov","female");
        groupMapGender.put("Eugenia","female");
        groupMapGender.put("Sergey","male");
        groupMapGender.put("Sergey","male");
        groupMapGender.put("Yaroslav","male");

        int women=0;
        for (String s:groupMapGender.keySet()) {//проход по ключам
            if(groupMapGender.get(s).equals("female")){//сравнение со значением
                women++;
            }
        }
        int men=0;
        for (String s:groupMapGender.values()) {
            if(s.equals("male")){
                men++;
            }
        }

        System.out.println("Women: "+ women);
        System.out.println("Men: "+ men);
    }
}
