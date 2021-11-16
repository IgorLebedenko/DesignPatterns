package com.github.ilebedenko.builder.builder;

import com.github.ilebedenko.builder.maze.*;

import static com.github.ilebedenko.builder.maze.Direction.*;

public class SimpleMazeBuilder implements MazeBuilder {

    private Maze maze;

    @Override
    public void buildMaze() {
        maze = new Maze();
    }

    @Override
    public void buildRoom(int number) {
        Room room = new Room(number);
        room.setSide(NORTH, new Wall());
        room.setSide(EAST, new Wall());
        room.setSide(SOUTH, new Wall());
        room.setSide(WEST, new Wall());
        maze.addRoom(room);
    }

    @Override
    public void buildDoor(int roomNumber1, int roomNumber2) {
        Room room1 = maze.getRoom(roomNumber1);
        Room room2 = maze.getRoom(roomNumber2);

        if (room1 == null || room2 == null)
            throw new IllegalArgumentException("The room with one of these numbers does not exist!");

        Direction room1DoorDirection;
        Direction room2DoorDirection;

        if (room1.getSide(NORTH) instanceof Wall && room2.getSide(SOUTH) instanceof Wall) {
            room1DoorDirection = NORTH;
            room2DoorDirection = SOUTH;
        } else if (room1.getSide(EAST) instanceof Wall && room2.getSide(WEST) instanceof Wall) {
            room1DoorDirection = EAST;
            room2DoorDirection = WEST;
        } else if (room1.getSide(SOUTH) instanceof Wall && room2.getSide(NORTH) instanceof Wall) {
            room1DoorDirection = SOUTH;
            room2DoorDirection = NORTH;
        } else if (room1.getSide(WEST) instanceof Wall && room2.getSide(EAST) instanceof Wall) {
            room1DoorDirection = WEST;
            room2DoorDirection = EAST;
        } else {
            throw new IllegalArgumentException("Impossible to create a door between these rooms!");
        }

        Door door = new Door(room1, room2);
        room1.setSide(room1DoorDirection, door);
        room2.setSide(room2DoorDirection, door);
    }

    public Maze getMaze() {
        return maze;
    }
}
