package com.shahian;

class SedanFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}