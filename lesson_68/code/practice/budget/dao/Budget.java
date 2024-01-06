package practice.budget.dao;

import practice.budget.model.Product;
import practice.budget.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    boolean addPurchase(Purchase purchase);
    double calcExpenses();
    double expensesByPerson(String person);
    double expensesByStore(String store);
    double expensesByPeriod(LocalDate from,LocalDate to);
    double addMoney(double money);
    boolean checkBudget(Purchase purchase);// можем ли мы позволить себе эту покупку?
    double checkMoney(Purchase purchase);// можем ли мы позволить себе эту покупку?

}
