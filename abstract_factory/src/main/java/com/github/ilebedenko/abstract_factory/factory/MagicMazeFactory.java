package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.door.Door;
import com.github.ilebedenko.abstract_factory.door.MagicDoor;
import com.github.ilebedenko.abstract_factory.room.MagicRoom;
import com.github.ilebedenko.abstract_factory.room.Room;
import com.github.ilebedenko.abstract_factory.wall.MagicWall;
import com.github.ilebedenko.abstract_factory.wall.Wall;

public class MagicMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int number) {
        return new MagicRoom(number);
    }

    @Override
    public Wall createWall() {
        return new MagicWall();
    }

    @Override
    public Door createDoor(Room room1, Room room2) {
        return new MagicDoor(room1, room2);
    }
}
