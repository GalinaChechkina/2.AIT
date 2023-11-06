package practice.seasons;

import java.util.Arrays;

public class SeasonAppl {
    public static void main(String[] args) {
        // Опробовать на нем методы:
        // .values()
        // .toString
        // .ordinal()
        // .valueOf()

        Season[]seasons=Season.values();//создали массив длиной 4
        System.out.println(Arrays.toString(seasons));
        System.out.println(seasons.length);

        System.out.println("-----------Values 1---------");
        for (int i = 0; i < seasons.length; i++) {  // for loop
            System.out.println(seasons[i]);
        }

        System.out.println("-----------Values 2---------");
        for (Season s: seasons){                    // for each
            System.out.println(s.getName());
        }

        System.out.println("-----------to String---------");
        String str= Season.WIN.toString();
        System.out.println(str);

        System.out.println("-----------ordinal---------");
        int n = Season.SUM.ordinal();
        System.out.println(n);

        System.out.println("-----------valueOf---------");
        Season season = Season.valueOf("SPR");
        System.out.println(season.getName()+" is the best time of the year!");

    }
}
