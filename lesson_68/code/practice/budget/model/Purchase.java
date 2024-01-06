package practice.budget.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Purchase implements Comparable<Purchase>{
    private int id;
    private LocalDate date;
    private List<Product> products;
    private double cost;
    private String store;
    private String person;


    public Purchase(int id, LocalDate date,List<Product> products, String store, String person, double cost) {
        this.id = id;
        this.date = date;
        this.products=products;
        this.store = store;
        this.person = person;
        this.cost = cost+costPurchase(products);

    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCost() {
        return costPurchase(products);
    }

    public String getStore() {
        return store;
    }

    public String getPerson() {
        return person;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Purchase{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", products=").append(products);
        sb.append(", store='").append(store).append('\'');
        sb.append(", person='").append(person).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchase purchase = (Purchase) o;

        return id == purchase.id;
    }
    @Override
    public int hashCode() {
        return id;
    }

    public double costPurchase(List<Product>products){
        return products.stream()
                .mapToDouble(p->p.getPrice()*p.getQuantity())
                .sum();
    }

    @Override
    public int compareTo(Purchase o) {
        return this.date.compareTo(o.getDate());
    }
}
