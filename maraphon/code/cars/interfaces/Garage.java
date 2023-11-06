package cars.interfaces;

import cars.model.Car;

public interface Garage {
    boolean addCar (Car car);

    Garage removeCar(String regNumber);

    Garage findCarByRegNumber(String regNumber);

    Garage[] findCarsByModel(String model);

    Garage[] findCarsByCompany(String company);

    Garage[] findCarsByEngine(double min, double max);

    Garage[] findCarsByColor(String color);
}
