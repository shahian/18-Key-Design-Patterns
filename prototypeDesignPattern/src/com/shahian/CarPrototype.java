package com.shahian;

import java.util.HashMap;
import java.util.Map;

public class CarPrototype {
    private static Map<String,Car> carMap=new HashMap<>();
    static {
        SportsCar sportsCar=new SportsCar("Ferrari", "458 Italia", "Red");
        carMap.put("sportsCar",sportsCar);
    }
    public static Car getCar(String carType) throws CloneNotSupportedException {
        return carMap.get(carType).clone();
    }
}
