package practice.currencies.model;

import java.util.Objects;

public class Currency {
    private String name;
    private double courseBay;
    private double courseSell;

    public Currency(String name, double courseBay, double courseSell) {
        this.name = name;
        this.courseBay = courseBay;
        this.courseSell = courseSell;
    }
    public String getName() {
        return name;
    }
    public double getCourseBay() {
        return courseBay;
    }
    public double getCourseSell() {
        return courseSell;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(" ").append(name).append('\'');
        sb.append(" | Bay= ").append(courseBay);
        sb.append(" | Sell= ").append(courseSell);
        return sb.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        return Objects.equals(name, currency.name);
    }
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
