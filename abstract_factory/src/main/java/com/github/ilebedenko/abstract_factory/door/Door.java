package com.github.ilebedenko.abstract_factory.door;

import com.github.ilebedenko.abstract_factory.maze.MazeElement;
import com.github.ilebedenko.abstract_factory.room.Room;

public abstract class Door extends MazeElement {
    private Room room1;
    private Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room getRoomFromOtherSide(Room room) {
        if (room.getNumber() == room1.getNumber())
            return room2;
        if (room.getNumber() == room2.getNumber())
            return room1;
        throw new IllegalArgumentException("The door is not from this room!");
    }
}
