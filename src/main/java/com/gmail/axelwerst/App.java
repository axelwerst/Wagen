package com.gmail.axelwerst;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2020, 2.0));
        cars.add(new Car(2018, 1.6));
        cars.add(new Car(2019, 2.5));
        cars.add(new Car(2021, 1.8));


        cars.sort(Comparator.comparingInt(Car::getYearOfManufacture));
        System.out.println("Список автомобилей, отсортированных по году производства:");
        cars.forEach(System.out::println);


        TreeSet<Car> carSet = new TreeSet<>(Comparator.comparingDouble(Car::getEngineCapacity));
        carSet.addAll(cars);

        System.out.println("\nTreeSet автомобилей, отсортированных по объему двигателя:");
        carSet.forEach(System.out::println);

    }
}