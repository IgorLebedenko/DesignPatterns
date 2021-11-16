package com.github.ilebedenko.builder.maze;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Room extends MazeElement {
    @Getter
    private int number;
    private Map<Direction, MazeElement> sides;

    public Room(int number) {
        this.number = number;
        sides = new HashMap<>();
    }

    public void setSide(Direction direction, MazeElement mazeElement) {
        sides.put(direction, mazeElement);
    }

    public MazeElement getSide(Direction direction) {
        return sides.get(direction);
    }

    @Override
    protected void message() {
        System.out.println("Creating a SIMPLE ROOM.");
    }
}
