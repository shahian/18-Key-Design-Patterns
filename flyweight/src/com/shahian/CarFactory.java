package com.shahian;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory
public class CarFactory {
    private Map<String, Car> carCache;

    public CarFactory() {
        carCache = new HashMap<>();
    }

    public Car getCar(String brand) {
        Car car = carCache.get(brand);
        if (car == null) {
            car = new CarImpl(brand);
            carCache.put(brand, car);
        }
        return car;
    }
}
