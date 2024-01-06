package practice.budget.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.budget.dao.BudgetImpl;
import practice.budget.model.Product;
import practice.budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {
    List<Purchase> purchases=new ArrayList<>();
    List<Product> products1=new ArrayList<>();
    List<Product> products2=new ArrayList<>();
    List<Product> products3=new ArrayList<>();
    List<Product> products4=new ArrayList<>();

    BudgetImpl budget=new BudgetImpl(purchases,1000);

    @BeforeEach
    void setUp(){
        LocalDate now=LocalDate.now();
        products1=List.of(
                new Product("P1",1,1),
                new Product("P2",2,2),
                new Product("P3",3,3)
        );
        products2=List.of(
                new Product("P4",4,1)
        );
        products3=List.of(
                new Product("P4",4,1),
                new Product("P1",1,5),
                new Product("P2",2,10)
        );
        purchases= List.of(
                new Purchase(1,now.minusDays(1),products1,"A","P1",14),
                new Purchase(2,now.minusDays(2),products2,"B","P2",4),
                new Purchase(3,now.minusDays(3),products3,"C","P1",29)
        );
        for (Purchase purchase : purchases) {//наполнили budget с помощью цикла
            budget.addPurchase(purchase);
        }
        System.out.println(budget.calcExpenses());
    }

    @Test
    void addPurchase() {
        LocalDate now=LocalDate.now();
        assertFalse(budget.addPurchase(null));
        assertFalse(budget.addPurchase(purchases.get(0)));
        Purchase purchase=new Purchase(4,now.minusDays(2),products2,"B","P2",4);
        assertTrue(budget.addPurchase(purchase));
    }

    @Test
    void calcExpenses() {
        System.out.println(budget.calcExpenses());
    }

    @Test
    void expensesByPerson() {
        assertEquals(43,budget.expensesByPerson("P1"));
    }

    @Test
    void expensesByStore() {
        assertEquals(14,budget.expensesByStore("A"));
    }

    @Test
    void expensesByPeriod() {
        assertEquals(18,budget.expensesByPeriod(LocalDate.now().minusDays(3),LocalDate.now()));
    }

    @Test
    void addMoney() {
        System.out.println(budget.addMoney(100));
    }

    @Test
    void checkBudget() {
        products4= List.of(
                new Product("S",2000,2)
        );
        Purchase purchase=new Purchase(6,LocalDate.of(2023,12,19),products4,"Al","AAA",2000);
        budget.addPurchase(purchase);
        System.out.println(budget.checkBudget(purchase));
    }

    @Test
    void checkMoney() {
    }
}