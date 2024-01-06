package practice.homework.exchanger;

import practice.homework.exchanger.model.Currency;
import practice.homework.exchanger.model.Menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CurConv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our exchange office!");
        Menu[] menu = Menu.values();
        for (Menu m : menu) {
            System.out.println(m);
        }
        Set<String> curNames = new HashSet<>();
        for (int i = 0; i < menu.length; i++) {
            curNames.add(menu[i].getName());
        }

        while (true) {
            System.out.println("Select currency (number from 1 to " + menu[menu.length - 1].getNum() + ") : ");
            int currNumber = scanner.nextInt();
            System.out.println("Would you like to buy (press 'b') or sell (press 's')? ");
            String str = scanner.next();
            System.out.println("Input amount to exchange: ");
            int s = scanner.nextInt();

            if (str.equalsIgnoreCase("b")) {
                double n1 = menu[currNumber - 1].getCourseBuying();
                double res1 = s * n1;
                for (String name:curNames){
                    //if()
                }
                System.out.printf("Amount to be issued: %.2f", res1);
            }
            if (str.equalsIgnoreCase("s")) {
                double n2 = menu[currNumber - 1].getCourseSelling();
                double res2 = s * n2;
                System.out.printf("Amount to be issued: %.2f", res2);
            }
            System.out.println("\nShall we stop? (press 'y')");
            String string=scanner.next();
            if(string.equalsIgnoreCase("y")){
                break;
            }
        }
    }
}
