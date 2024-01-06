package practice.budget;

import practice.budget.dao.BudgetImpl;
import practice.budget.model.Menu;
import practice.budget.model.Product;
import practice.budget.model.Purchase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetAppl {
    public static void main(String[] args) {

        List<Purchase>purchaseList = new ArrayList<>();
        List<Product>productList = new ArrayList<>();

        BudgetImpl budget= new BudgetImpl(purchaseList,0);
        LocalDate now=LocalDate.now();


        while (true){

            Menu.printMenu();

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./dest/family_budget.csv"))) {
                List<Purchase> purchases = (List<Purchase>) ois.readObject(); //в лист сложили все, что прочитали из файла
                System.out.println("Прочитанный список: " + purchases);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice= scanner.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("Input budget amount: ");
                    double b= scanner.nextDouble();

                    break;
                }
                case 2: {
                    //break;
                }
                case 3: {
                    System.out.println("Purchases by Stores: ");
                    //break;
                }
                case 4: {
                    System.out.println("Purchases by Person: ");
                    //break;
                }
                case 5: {
                    System.out.println("Purchases by Period: ");
                    //break;
                }
                case 6: {
                    System.out.println("Input amount of purchase: ");
                    //break;
                }
                case 7: {
                    return;
                }
                default: {
                    System.out.println("Wrong choice!");
                }
            }
        }
    }
}
