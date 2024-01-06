package practice.employee_save_read;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String street;
    private int building;
    private int aprt;

    public Address(String city, String street, int building, int aprt) {
        System.out.println("Constructor Address is working...");
        this.city = city;
        this.street = street;
        this.building = building;
        this.aprt = aprt;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getAprt() {
        return aprt;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public void setAprt(int aprt) {
        this.aprt = aprt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", building=").append(building);
        sb.append(", aprt=").append(aprt);
        sb.append('}');
        return sb.toString();
    }

}
