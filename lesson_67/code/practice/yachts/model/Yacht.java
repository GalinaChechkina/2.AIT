package practice.yachts.model;

import java.util.Objects;

public class Yacht implements Comparable<Yacht>{
    private String shipyard;
    private int year;
    private double length;
    private String material;
    private double price;

    public Yacht(String shipyard, int year, double length, String material, double price) {
        this.shipyard = shipyard;
        this.year = year;
        this.length = length;
        this.material = material;
        this.price = price;
    }

    public String getShipyard() {
        return shipyard;
    }

    public void setShipyard(String shipyard) {
        this.shipyard = shipyard;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Yacht{");
        sb.append("shipyard='").append(shipyard).append('\'');
        sb.append(", year=").append(year);
        sb.append(", length=").append(length);
        sb.append(", material='").append(material).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yacht yacht = (Yacht) o;

        if (year != yacht.year) return false;
        if (Double.compare(length, yacht.length) != 0) return false;
        if (Double.compare(price, yacht.price) != 0) return false;
        if (!Objects.equals(shipyard, yacht.shipyard)) return false;
        return Objects.equals(material, yacht.material);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shipyard != null ? shipyard.hashCode() : 0;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Yacht o) {
        return Double.compare(o.price,this.price);
    }
}
