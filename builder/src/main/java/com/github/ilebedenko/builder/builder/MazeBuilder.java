package com.github.ilebedenko.builder.builder;

public interface MazeBuilder {

    void buildMaze();

    void buildRoom(int number);

    void buildDoor(int roomNumber1, int roomNumber2);
}
