package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.door.Door;
import com.github.ilebedenko.abstract_factory.room.Room;
import com.github.ilebedenko.abstract_factory.wall.Wall;

public interface MazeFactory {
    Room createRoom(int number);

    Wall createWall();

    Door createDoor(Room room1, Room room2);
}
