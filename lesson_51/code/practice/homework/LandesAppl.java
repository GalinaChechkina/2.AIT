package practice.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LandesAppl {
    public static void main(String[] args) {

        Set<String> landes = new HashSet<>();
        System.out.println("Hello!");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Land: ");
            String newLand = scanner.nextLine();
            landes.add(newLand);

            System.out.println("Continue? Press s to stop.");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
        System.out.println("Landes: " + landes);
    }
}
