package com.shahian;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        SportsCar sportsCar1 = (SportsCar) CarPrototype.getCar("sportsCar");
        sportsCar1.addSpoiler();
        sportsCar1.addRacingStripes();

        SportsCar sportsCar2 = (SportsCar) new CarPrototype().getCar("sportsCar");
        sportsCar2.setColor("Blue");
        sportsCar2.addSpoiler();
        sportsCar2.addRacingStripes();
        System.out.println(sportsCar1);
        System.out.println(sportsCar2);
    }
}
