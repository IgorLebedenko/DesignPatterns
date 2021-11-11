package com.github.ilebedenko.abstract_factory;

import com.github.ilebedenko.abstract_factory.factory.MagicMazeFactory;
import com.github.ilebedenko.abstract_factory.factory.SimpleMazeFactory;
import com.github.ilebedenko.abstract_factory.maze.MazeBuilder;

public class MazeGame {
    public static void main(String[] args) {
        System.out.println("--- CREATING SIMPLE MAZE ---");
        MazeBuilder.createMaze(new SimpleMazeFactory());
        System.out.println("--- CREATING MAGIC MAZE ---");
        MazeBuilder.createMaze(new MagicMazeFactory());
    }
}
