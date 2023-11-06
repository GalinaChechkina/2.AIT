package practice;

import java.util.Scanner;

public class TicketCinema {
    public static void main(String[] args) {
       // В кинотеатре есть разные типы билетов:
        // стандартный, студенческий (-10%) и для пенсионеров(-25%).
        // Каждый тип билета имеет свою стоимость.
        // Клиент может также выбрать место в VIP-зоне,
        // что увеличит стоимость билета на 25%.
        // Создайте метод calculateTicketPrice,
        // который принимает возраст клиента, статус студента и флаг VIP-места.

        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you? (input the number)");
        int old= scanner.nextInt();
        System.out.println("Are you a student? (y/n)");
        String st= scanner.next();
        System.out.println("Would you like to get a VIP place? (y/n)");
        String pl= scanner.next();
        int stand= 8;
        double pr= price(old,st,pl,stand);
        System.out.println("The cost of your ticket is " +pr);
    }
    public static double price(int old, String st, String pl, int stand) {
        double pr = 0;
        if (old >= 65) {
            switch (pl) {
                case "y" -> pr = stand * 0.75 * 1.25;
                case "n" -> pr = stand * 0.75;
                default -> System.out.println("Error");
            }
        }
        if (old < 65) {
            switch (st) {
                case "y":
                    switch (pl) {
                        case "y" -> pr = stand * 0.9 * 1.25;
                        case "n" -> pr = stand * 0.9;
                        default -> System.out.println("Error");
                    }
                    ;
                    break;
                case "n":
                    switch (pl) {
                        case "y" -> pr = stand * 1.25;
                        case "n" -> pr = stand;
                        default -> System.out.println("Error");
                    }
                    ;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        return pr;
    }
}
