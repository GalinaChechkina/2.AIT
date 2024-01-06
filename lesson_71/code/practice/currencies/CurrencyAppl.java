package practice.currencies;

import practice.currencies.model.Currency;
import practice.currencies.model.Menu;

import java.io.*;
import java.util.*;

public class CurrencyAppl {

    private static Map<String, Currency> currencies = new HashMap<>();
    private static Map<String, Double> logBuy = new HashMap<>();
    private static Map<String, Double> logSell = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to our exchange office!");

        while (true){

            loadCurrencies();
            printMenu();

            System.out.println("\nShall we stop? (press 'y')");
            String string=scanner.next();
            if(string.equalsIgnoreCase("y")){
                printReport();
                break;
            }
        }
    }

    private static void printReport() {
        try {
            BufferedReader reader= new BufferedReader(new FileReader("transaction_log.txt"));
            String str;
            while ((str=reader.readLine()) != null) {
                String[] cells = str.split(",");
                for (int i = 0; i < cells.length; i++) {
                    System.out.print(cells[i]);
                }
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void loadCurrencies() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./lesson_71/code/practice/currencies/currency.csv"))) {
            String str;
            while ((str= reader.readLine()) != null) {
                String[] cells = str.split(",");
                String name = cells[0];
                double buy = Double.parseDouble(cells[1]);
                double sell = Double.parseDouble(cells[2]);
                currencies.put(name, new Currency(name, buy, sell));
            }
            currencies.forEach((s1,s2)-> System.out.println(s1+" : "+s2));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    private static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available currencies: " + currencies.keySet());
        System.out.print("Input the currency: ");
        String currencyName = scanner.nextLine().toUpperCase();//преобразуем все символы строки в верхний регистр
        if (!currencies.containsKey(currencyName)) {
            System.out.println("Invalid currency.");
            return;
        }

        System.out.print("Input the amount for exchange: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Choose transaction (BUY or SELL): ");
        String type = scanner.nextLine().toUpperCase();
        if (!type.equals("BUY") && !type.equals("SELL")) {
            System.out.println("Invalid transaction type.");
            return;
        }

        Menu menu = Menu.valueOf(type);
        calcAmountTransaction(currencyName, amount, menu);
        saveTransactionLog();
    }

    private static void calcAmountTransaction(String currencyName, double amount, Menu menu) {
        Currency currency = currencies.get(currencyName);
        double totalAmount;
        if (menu == Menu.BUY) {//берем курс, по которому банк покупает
            totalAmount = amount / currency.getCourseSell(); //логика: принесла сумму евро- получила сумму в $
            logBuy.put(currencyName, logBuy.getOrDefault(currencyName, 0.0) + totalAmount);
            System.out.println("Amount to be received: " + totalAmount + " " + currencyName);
        }
        if (menu == Menu.SELL){//берем курс, по которому банк продает
            totalAmount = amount * currency.getCourseBay(); //принесла сумму в $- получила в евро
            logSell.put(currencyName, logSell.getOrDefault(currencyName, 0.0) + totalAmount);
            System.out.println("Amount to be received: " + totalAmount + " euro");
        }
    }

    private static void saveTransactionLog() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("transaction_log.txt"))) {
            writer.println("Buy Transactions: ");
            for (Map.Entry<String, Double> entry : logBuy.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue()+" | ");
            }

            writer.println("\nSell Transactions: ");
            for (Map.Entry<String, Double> entry : logSell.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("transaction_log saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}