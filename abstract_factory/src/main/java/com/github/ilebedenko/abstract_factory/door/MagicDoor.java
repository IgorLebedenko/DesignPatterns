package com.github.ilebedenko.abstract_factory.door;

import com.github.ilebedenko.abstract_factory.room.Room;

public class MagicDoor extends Door {
    public MagicDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    protected void message() {
        System.out.println("Creating a MAGIC DOOR. You need the right spell to open it!");
    }
}
