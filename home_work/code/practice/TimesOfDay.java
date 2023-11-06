package practice;

import java.util.Scanner;

public class TimesOfDay {
    public static void main(String[] args) {
        boolean is = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the current hour (number between 0 to 23):");
            int h = scanner.nextInt();
            switch (h) {
                case 0, 1, 2, 3, 4, 5 -> System.out.println("It's night now");
                case 6, 7, 8, 9, 10, 11 -> System.out.println("It's morning now");
                case 12, 13, 14, 15, 16, 17 -> System.out.println("It's day now");
                case 18, 19, 20, 21, 22, 23 -> System.out.println("It's evening now");
            }
            System.out.println("Shall we continue? (y/n)");
            String s = scanner.next();

            if (s.equals("y")) {
                is = true;
            } else {
                is = false;
                System.out.println("Bye!");
            }
        }
        while (is);
    }
}