package com.github.ilebedenko.design_patterns.creational.abstract_factory.room;

import com.github.ilebedenko.design_patterns.creational.abstract_factory.maze.Direction;
import com.github.ilebedenko.design_patterns.creational.abstract_factory.maze.MazeElement;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public abstract class Room extends MazeElement {
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
}
