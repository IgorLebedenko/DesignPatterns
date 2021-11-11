package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.door.Door;
import com.github.ilebedenko.abstract_factory.door.SimpleDoor;
import com.github.ilebedenko.abstract_factory.room.Room;
import com.github.ilebedenko.abstract_factory.room.SimpleRoom;
import com.github.ilebedenko.abstract_factory.wall.SimpleWall;
import com.github.ilebedenko.abstract_factory.wall.Wall;

public class SimpleMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int number) {
        return new SimpleRoom(number);
    }

    @Override
    public Wall createWall() {
        return new SimpleWall();
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new SimpleDoor(room1, room2);
    }
}
