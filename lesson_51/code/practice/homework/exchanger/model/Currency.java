package practice.homework.exchanger.model;

import java.util.Objects;

public class Currency {
    private String name;
    private double courseSell;
    private double courseBay;

    public Currency(String name, double courseSell, double courseBay) {
        this.name = name;
        this.courseSell = courseSell;
        this.courseBay = courseBay;
    }
    public String getName() {
        return name;
    }
    public double getCourseSell() {
        return courseSell;
    }
    public double getCourseBay() {
        return courseBay;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Currency{");
        sb.append("name='").append(name).append('\'');
        sb.append(", courseSell=").append(courseSell);
        sb.append(", courseBay=").append(courseBay);
        sb.append('}');
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
