package com.github.ilebedenko.design_patterns.creational.abstract_factory.room;

public class SimpleRoom extends Room {

    public SimpleRoom(int number) {
        super(number);
    }

    @Override
    protected void message() {
        System.out.println("Creating a SIMPLE ROOM.");
    }
}
