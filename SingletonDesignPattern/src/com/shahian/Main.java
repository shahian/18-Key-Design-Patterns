package com.shahian;

public class Main {

    public static void main(String[] args) {
        Car.resetInstance();
        Car car1 = Car.getInstance("Toyota", "Perado", "black");
        Car.resetInstance();
        Car car2 = Car.getInstance("Kia", "Mouavi", "red");
        Car.resetInstance();
        Car car3 = Car.getInstance("Hyundai", "Santafeh", "silver");
        Car.resetInstance();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        // write your code here
    }
}
