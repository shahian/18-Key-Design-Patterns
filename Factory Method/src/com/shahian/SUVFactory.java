package com.shahian;

class SUVFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }
}