package practice.car.model;

public class Car {

    //поля классa
    private String brand;
    private String color;
    private String model;
    private int year;
    private double enginPower;
    private String fuelType;

    //конструктор класса

    public Car(String brand, String color, String model, int year, double enginPower, String fuelType) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.enginPower = enginPower;
        this.fuelType = fuelType;
    }
    //геттеры и сеттеры

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getEnginPower() {
        return enginPower;
    }
    public void setEnginPower(double enginPower) {
        this.enginPower = enginPower;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void displayCar(){
        System.out.println("Brand: "+brand+"; Color: "+color+"; Model: "+ model+"; Year: "+year+"; Engine: "+ enginPower+"; Fuel type: "+fuelType);
    }
}
