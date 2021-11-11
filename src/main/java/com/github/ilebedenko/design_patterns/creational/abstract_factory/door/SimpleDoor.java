package com.github.ilebedenko.design_patterns.creational.abstract_factory.door;

import com.github.ilebedenko.design_patterns.creational.abstract_factory.room.Room;

public class SimpleDoor extends Door {

    public SimpleDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    protected void message() {
        System.out.println("Creating a SIMPLE DOOR.");
    }
}
