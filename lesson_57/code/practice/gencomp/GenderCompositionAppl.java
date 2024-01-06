package practice.gencomp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GenderCompositionAppl {
    public static void main(String[] args) {

        Map<Integer,String>genderMap=new HashMap<>();

        System.out.println("Welcome to GenderList Application!");

        while (true) {

            Menu.printMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {

                    case 1: {
                        scanner.nextLine();
                        System.out.println("Input employee id: ");
                        int id = scanner.nextInt();
                        System.out.println("Input employee gender ('male', 'female' or 'other': ");
                        String gender = scanner.next();
                        genderMap=generation( genderMap,id, gender);
                        break;
                    }
                    case 2: {
                        System.out.println("Report: ");
                        printReport(genderMap);
                        break;
                    }
                    case 3: {
                        System.out.println("List of employee genders: ");
                        printList(genderMap);
                        break;
                    }
                    case 4: {
                        return;
                    }
                    default: {
                        System.out.println("Wrong input.");
                    }
                }
            }catch (Exception e){
                System.out.println("Data entry error!  "+e.toString());
            }
        }
    }
    public static Map<Integer,String> generation(Map<Integer,String> genderMap, int id, String gender){
        genderMap.put(id,gender);
        return genderMap;
    }
    public static void printReport(Map<Integer,String>genderMap){
        int male=0;
        for (String s:genderMap.values()) {
            if(s.equalsIgnoreCase("male")){
                male++;
            }
        }
        int female=0;
        for (String s:genderMap.values()) {
            if(s.equalsIgnoreCase("female")){
                female++;
            }
        }
        int other=0;
        for (String s:genderMap.values()) {
            if(s.equalsIgnoreCase("other")){
                other++;
            }
        }
        System.out.println("Women: "+ female);
        System.out.println("Men: "+ male);
        System.out.println("Non-binary people: "+ other);
    }
    public static void printList(Map<Integer,String>genderMap){
        for (Map.Entry<Integer,String> e: genderMap.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
