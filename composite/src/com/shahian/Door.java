package com.shahian;

public class Door implements CarComponent{
    @Override
    public void assemble() {
        System.out.println("Assembly the door.");
    }
}
