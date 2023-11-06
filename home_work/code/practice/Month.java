package practice;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a month number (number between 1 to 12)");
        int m = scanner.nextInt();
        System.out.println("Input a year");
        int y = scanner.nextInt();
        int res=0;

        month(m,y);
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                    res = 31;
                    System.out.println("This month has " +res+ " days");
                    break;
            case 2:
                    res = leap(y, res);
                    System.out.println("This month has " +res+ " days");
                    break;
            case 4, 6, 9, 11:
                    res = 30;
                    System.out.println("This month has " +res+ " days");
                    break;
            default:
                    System.out.println("Mistake!");
                break;
            }
    }
        public static void month(int m, int y) {
        switch (m){
            case 1 -> System.out.println("This is January " +y);
            case 2 -> System.out.println("This is February " +y);
            case 3 -> System.out.println("This is March " +y);
            case 4 -> System.out.println("This is April " +y);
            case 5 -> System.out.println("This is May " +y);
            case 6 -> System.out.println("This is June " +y);
            case 7 -> System.out.println("This is July " +y);
            case 8 -> System.out.println("This is August " +y);
            case 9 -> System.out.println("This is September " +y);
            case 10 -> System.out.println("This is October " +y);
            case 11 -> System.out.println("This is November " +y);
            case 12 -> System.out.println("This is December " +y);
            default -> System.out.println("Wrong input!");
        }
    }
    public static int leap(int y, int res){
        if ((y % 4 == 0 && y % 100 != 0) | (y % 4 == 0 && y % 100 == 0 && y % 400 == 0)) {
            res=29;
            return res;
        } else {
            res=28;
            return res;
        }
    }
}



