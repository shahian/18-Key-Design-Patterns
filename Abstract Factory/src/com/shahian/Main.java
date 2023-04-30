package com.shahian;

import com.shahian.abstractFactory.CarFactory;
import com.shahian.abstractFactory.FamilyCarFactory;
import com.shahian.abstractFactory.SUV;
import com.shahian.abstractFactory.Sedan;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new FamilyCarFactory();
        Sedan sedan = factory.createSedan();
        SUV suv = factory.createSUV();

        System.out.println(sedan.getName() + " with " + sedan.getNumDoors() + " doors"); // Output: "Family Sedan with 4 doors"
        System.out.println(suv.getName() + " with " + suv.getNumDoors() + " doors"); // Output: "Family SUV with 5 doors"
    }
}
