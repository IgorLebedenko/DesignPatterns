package com.github.ilebedenko.design_patterns.creational.abstract_factory.maze;

import com.github.ilebedenko.design_patterns.creational.abstract_factory.door.Door;
import com.github.ilebedenko.design_patterns.creational.abstract_factory.factory.MazeFactory;
import com.github.ilebedenko.design_patterns.creational.abstract_factory.room.Room;

import static com.github.ilebedenko.design_patterns.creational.abstract_factory.maze.Direction.*;

public class MazeBuilder {

    public static Maze createMaze(MazeFactory factory) {
        Maze maze = new Maze();

        Room room1 = factory.createRoom(1);
        Room room2 = factory.createRoom(2);
        Door door = factory.createDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(NORTH, factory.createWall());
        room1.setSide(EAST, door);
        room1.setSide(SOUTH, factory.createWall());
        room1.setSide(WEST, factory.createWall());

        room2.setSide(NORTH, factory.createWall());
        room2.setSide(EAST, factory.createWall());
        room2.setSide(SOUTH, factory.createWall());
        room2.setSide(WEST, door);

        return maze;
    }
}
