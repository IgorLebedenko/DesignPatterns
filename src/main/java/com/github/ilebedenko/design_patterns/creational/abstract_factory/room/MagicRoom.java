package com.github.ilebedenko.design_patterns.creational.abstract_factory.room;

public class MagicRoom extends Room {

    public MagicRoom(int number) {
        super(number);
    }

    @Override
    protected void message() {
        System.out.println("Creating a MAGIC ROOM. All objects in it behave strangely!");
    }
}
