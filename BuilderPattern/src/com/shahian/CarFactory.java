package com.shahian;

public class CarFactory {
    public Car buildCar(CarBuilder builder) {
        builder.addEngine("V8"); // Default engine
        builder.addWheels(4); // Default number of wheels
        builder.addDoors(4); // Default number of doors
        builder.addColor("Red"); // Default color

        return builder.build();
    }
}
