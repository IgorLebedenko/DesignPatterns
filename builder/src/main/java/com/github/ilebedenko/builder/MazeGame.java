package com.github.ilebedenko.builder;

import com.github.ilebedenko.builder.builder.CountingMazeBuilder;
import com.github.ilebedenko.builder.builder.SimpleMazeBuilder;

public class MazeGame {
    public static void main(String[] args) {
        System.out.println("--- CREATING SIMPLE MAZE ---");
        SimpleMazeBuilder simpleMazeBuilder = new SimpleMazeBuilder();
        simpleMazeBuilder.buildMaze();
        simpleMazeBuilder.buildRoom(1);
        simpleMazeBuilder.buildRoom(2);
        simpleMazeBuilder.buildDoor(1, 2);
        simpleMazeBuilder.getMaze();

        System.out.println("--- CREATING COUNTING MAZE ---");
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        countingMazeBuilder.buildMaze();
        countingMazeBuilder.buildRoom(1);
        countingMazeBuilder.buildRoom(2);
        countingMazeBuilder.buildDoor(1, 2);
        countingMazeBuilder.getMazeInfo();
    }
}
