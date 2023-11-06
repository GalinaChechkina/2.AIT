package cars.model;

import cars.interfaces.Garage;

public class Car implements Garage {
    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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
    public String getCompany() {
        return company;
    }
    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return regNumber.equals(car.regNumber);
    }

    @Override
    public int hashCode() {
        return regNumber.hashCode();
    }

    @Override
    public boolean addCar(Car car) {
        return false;
    }

    @Override
    public Garage removeCar(String regNumber) {
        return null;
    }

    @Override
    public Garage findCarByRegNumber(String regNumber) {
        return null;
    }

    @Override
    public Garage[] findCarsByModel(String model) {
        return new Garage[0];
    }

    @Override
    public Garage[] findCarsByCompany(String company) {
        return new Garage[0];
    }

    @Override
    public Garage[] findCarsByEngine(double min, double max) {
        return new Garage[0];
    }

    @Override
    public Garage[] findCarsByColor(String color) {
        return new Garage[0];
    }
}

