package com.shahian;

public class Wheel implements CarComponent{
    @Override
    public void assemble() {
        System.out.println("Assembling a wheel.");
    }
}
