package cars.dao;

import cars.model.Car;

public interface Garage {

    boolean addCar(Car car);
    Car removeCarByRegNumber(String regNumber);
    Car findCarByRegNumber (String regNumber);
    Car[] findCarByModel (String model);
    Car[] findCarByCompany (String company);
    Car[] findCarByEngine (double min, double max);
    Car[] findCarByColor (String color);
    int size();

}
