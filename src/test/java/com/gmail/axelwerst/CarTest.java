package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCarSortingByYearOfManufacture() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2020, 2.0));
        cars.add(new Car(2018, 1.6));
        cars.add(new Car(2019, 2.5));
        cars.add(new Car(2021, 1.8));
        cars.sort(Comparator.comparingInt(Car::getYearOfManufacture));
        assertEquals(2018, cars.get(0).getYearOfManufacture());
        assertEquals(2019, cars.get(1).getYearOfManufacture());
        assertEquals(2020, cars.get(2).getYearOfManufacture());
        assertEquals(2021, cars.get(3).getYearOfManufacture());
    }

    @Test
    void testTreeSetSortingByEngineCapacity() {
        Set<Car> carSet = new TreeSet<>(Comparator.comparingDouble(Car::getEngineCapacity));
        carSet.add(new Car(2020, 2.0));
        carSet.add(new Car(2018, 1.6));
        carSet.add(new Car(2019, 2.5));
        carSet.add(new Car(2021, 1.8));
        Iterator<Car> iterator = carSet.iterator();
        assertEquals(1.6, iterator.next().getEngineCapacity());
        assertEquals(1.8, iterator.next().getEngineCapacity());
        assertEquals(2.0, iterator.next().getEngineCapacity());
        assertEquals(2.5, iterator.next().getEngineCapacity());
    }

    @Test
    void testCarEquality() {
        Car car1 = new Car(2020, 2.0);
        Car car2 = new Car(2020, 2.0);
        Car car3 = new Car(2021, 1.8);
        assertNotEquals(car1, car3);
        assertNotSame(car1, car2); // Разные объекты
    }

    @Test
    void testCarToString() {
        Car car = new Car(2020, 2.0);
        assertEquals("Car{yearOfManufacture=2020, engineCapacity=2.0}", car.toString());
    }
}