package com.shahian;

public interface CarBuilder {
    public void addEngine(String engine);
    public void addWheels(int wheels);
    public void addDoors(int doors);
    public void addColor(String color);
    public Car build();
}
