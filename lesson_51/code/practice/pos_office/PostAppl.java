package practice.pos_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostAppl {
    public static void main(String[] args) {

        // Написать приложение, которое позволит понять,
        // из каких мест на данную почту приходят письма.

        //Оператор вводит индексы приходящих писем; будем заносить их в хеш-сет
        //В конце смены распечатать хеш-сет

        Set<String>postCodes=new HashSet<>();

        do {
            System.out.println("Welcome to post office!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Postcode: ");
            String newPostCode = scanner.nextLine();
            if(postCodes.add(newPostCode)){
                System.out.println("Postcode added.");
            } else {
                System.out.println("Postcode already exist.");
            }
            System.out.println("Continue? Press s to stop.");
            String choice=scanner.nextLine();
            if (choice.equalsIgnoreCase("s")){
                break;
            }
        } while (true);
        System.out.println("Postcodes: "+postCodes);
    }
}
