package practice.archive;

import practice.archive.dao.ArchiveImpl;
import practice.archive.model.Doc;
import practice.archive.model.Menu;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class ArchiveAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to Archive Application!");
        ArchiveImpl archive=new ArchiveImpl(10);

        while (true) {
            Menu.printMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select option: ");
            int opt = scanner.nextInt();

            switch (opt) {

                case 1: {
                    //scanner.nextLine();
                    System.out.println("Input the document ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Input the document folder ID: ");
                    int idFolder = scanner.nextInt();
                    System.out.println("Input the name of the document: ");
                    String name = scanner.next();
                    System.out.println("Input the document URL: ");
                    String ur = scanner.next();
                    LocalDateTime loc= LocalDateTime.now();
                    Doc doc=new Doc(idFolder,id,name,ur,loc);
                    archive.addDoc(doc);
                    break;
                }
                case 2: {
                    System.out.println("List of your documents: ");
                    archive.printDocuments();
                    break;
                }

                case 3: {
                    System.out.println("You have " + archive.size() + " documents in the archive.");
                    break;
                }
                case 4:
                    return;
                default: {
                    System.out.println("Wrong input.");
                    break;
                }
            }
        }
    }
}
