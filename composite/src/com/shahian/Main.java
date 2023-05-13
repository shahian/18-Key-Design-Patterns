package com.shahian;

public class Main {

    public static void main(String[] args) {
        CarComponent engin = new Engine();
        CarComponent door1 = new Door();
        CarComponent door2 = new Door();
        CarComponent wheel1 = new Wheel();
        CarComponent wheel2 = new Wheel();
        Body body = new Body();
        body.addComponent(engin);
        body.addComponent(door1);
        body.addComponent(door2);
        body.addComponent(wheel1);
        body.addComponent(wheel2);
        Car car = new Car();
        car.addComponent(engin);
        car.addComponent(body);
        car.assemble();

    }
}
