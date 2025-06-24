package cars.dao;

import cars.model.Car;

import java.util.Objects;

public class GarageImpl implements Garage{
    int size;
    Car[] cars;


    public GarageImpl(int capacity){cars = new Car[capacity];}


    @Override
    public boolean addCar(Car car) {
        if(car == null||
                size == cars.length||
                findCarByRegNumber(car.getRegNumber())!=null){
            return false;
        }
        cars[size]=car;
        size++;
        return true;
    }

    @Override
    public Car removeCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber()==regNumber){
                Car destroyed = cars[i];
                cars[i] = cars[size-1];
                size--;
                cars[size]=null;
                return destroyed;
            }

        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getRegNumber(), regNumber)){
                return cars[i];
            }

        }
        return null;
    }

    @Override
    public Car[] findCarByModel(String model) {
        int count =0;
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getModel(), model)){
                count++;
            }
        }
        int index = 0;
        Car[] right = new Car[count];
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getModel(), model)){
                right[index] = cars[i];
                index++;
            }

        }

        if(right.length==0){
            return null;
        }
        return right;
    }

    @Override
    public Car[] findCarByCompany(String company) {
        int count =0;
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getCompany(), company)){
                count++;
            }
        }
        int index = 0;
        Car[] right = new Car[count];
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getCompany(), company)){
                right[index] = cars[i];
                index++;
            }

        }

        if(right.length==0){
            return null;
        }
        return right;
    }

    @Override
    public Car[] findCarByEngine(double min, double max) {
        int count =0;
        for (int i = 0; i < size; i++) {
            if(cars[i].getEngine()>=min&&cars[i].getEngine()<=max){
                count++;
            }
        }
        Car[] right = new Car[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(cars[i].getEngine()>=min&&cars[i].getEngine()<=max){
                right[index] = cars[i];
                index++;
            }

        }

        if(right.length==0){
            return null;
        }
        return right;
    }

    @Override
    public Car[] findCarByColor(String color) {
        int count =0;
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getColor(), color)){
                count++;
            }
        }
        int index = 0;
        Car[] right = new Car[count];
        for (int i = 0; i < size; i++) {
            if(Objects.equals(cars[i].getColor(), color)){
                right[index] = cars[i];
                index++;
            }

        }

        if(right.length==0){
            return null;
        }
        return right;
    }

    @Override
    public int size() {
        return size;
    }
}
