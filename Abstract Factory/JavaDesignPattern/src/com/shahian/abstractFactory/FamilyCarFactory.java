package com.shahian.abstractFactory;

public class FamilyCarFactory implements CarFactory{
    @Override
    public Sedan createSedan() {
        return new FamilySedan();
    }

    @Override
    public SUV createSUV() {
        return new FamilySUV();
    }
}
