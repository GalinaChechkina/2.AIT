package practice.budget.dao;

import practice.budget.model.Purchase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{

    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>();
        this.budget = budget-calcExpenses();
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        if(purchase==null||purchaseList.contains(purchase)){
            return false;
        }
        return purchaseList.add(purchase);
    }
    @Override
    public double calcExpenses() {//сколько потрачено
        return purchaseList.stream()
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double expensesByPerson(String person) {//сколько потрачено человеком
        return purchaseList.stream()
                .filter(purchase -> purchase.getPerson().equalsIgnoreCase(person))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double expensesByStore(String store) {//сколько потрачено в магазине
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equalsIgnoreCase(store))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double expensesByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(p->p.getDate().isAfter(from) && p.getDate().isBefore(to))
                .mapToDouble(Purchase::getCost)
                .sum();
    }

    @Override
    public double addMoney(double money) {//добавили деньги в бюджет
        return budget-calcExpenses()+money;
    }

    @Override
    public boolean checkBudget(Purchase purchase) {//при покупке бюджет не уходит в ноль
        return budget>=calcExpenses();
    }

    @Override
    public double checkMoney(Purchase purchase) {
        return budget-calcExpenses();
    }
}
