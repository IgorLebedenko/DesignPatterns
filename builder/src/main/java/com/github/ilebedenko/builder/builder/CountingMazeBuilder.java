package com.github.ilebedenko.builder.builder;

public class CountingMazeBuilder implements MazeBuilder {

    private int rooms;
    private int doors;

    @Override
    public void buildMaze() {
        rooms = 0;
        doors = 0;
    }

    @Override
    public void buildRoom(int number) {
        rooms++;
    }

    @Override
    public void buildDoor(int roomNumber1, int roomNumber2) {
        doors++;
    }

    public void getMazeInfo() {
        System.out.println(String.format("Maze has %d rooms and %d doors.", rooms, doors));
    }
}
