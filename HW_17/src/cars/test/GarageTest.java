package cars.test;
import cars.dao.Garage;
import cars.dao.GarageImpl;
import cars.model.Car;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage garage;
    Car[] car;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        car = new Car[4];
        car[0] = new Car("AB1769", "Lagom","Shcoda",500,"Green");
        car[1] = new Car("ZS1691", "Lagom","Shcoda",400,"Green");
        car[2] = new Car("CD8991", "Spagetti","Ferrari",700,"Yellow");
        car[3] = new Car("GD1991", "Fastio","Ferrari",1500,"Red");
        for (int i = 0; i < car.length; i++) {
            garage.addCar(car[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void addCar() {
        assertFalse(garage.addCar(car[3]));
        Car car = new Car("AR8769", "Expencivo","Lexus",501,"Greenish");
        assertTrue(garage.addCar(car));
        assertEquals(5,garage.size());
        car = new Car("DJ1939", "Vesta","Lada",300,"Blue");
        assertFalse(garage.addCar(car));
    }

    @org.junit.jupiter.api.Test
    void removeCarByRegNumber() {
        assertEquals(car[0], garage.removeCarByRegNumber("AB1769"));
        assertEquals(3,garage.size());
        assertNull(garage.removeCarByRegNumber("AB1769"));
        assertEquals(3,garage.size());

    }

    @org.junit.jupiter.api.Test
    void findCarByRegNumber() {
        assertEquals(car[2],garage.findCarByRegNumber("CD8991"));
        assertNull(garage.findCarByRegNumber("aAz333"));

    }

    @org.junit.jupiter.api.Test
    void findCarByModel() {
        Car[] testCars = new Car[]{car[0], car[1]};
        assertArrayEquals(testCars,garage.findCarByModel("Lagom"));
        assertNull(garage.findCarByModel("Based"));

    }

    @org.junit.jupiter.api.Test
    void findCarByCompany() {
        Car[] testCars = new Car[]{car[0], car[1]};
        assertArrayEquals(testCars,garage.findCarByCompany("Shcoda"));
        assertNull(garage.findCarByCompany("Based"));
    }

    @org.junit.jupiter.api.Test
    void findCarByEngine() {
        Car[] testCars = new Car[]{car[2], car[3]};
        assertArrayEquals(testCars,garage.findCarByEngine(700,1600));
        assertNull(garage.findCarByEngine(9000,10000));
    }

    @org.junit.jupiter.api.Test
    void findCarByColor() {
        Car[] testCars = new Car[]{car[0], car[1]};
        assertArrayEquals(testCars,garage.findCarByColor("Green"));
        assertNull(garage.findCarByColor("Cheese"));
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(4,garage.size());
    }
}