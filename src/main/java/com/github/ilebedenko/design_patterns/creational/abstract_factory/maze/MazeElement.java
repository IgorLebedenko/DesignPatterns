package com.github.ilebedenko.design_patterns.creational.abstract_factory.maze;

public abstract class MazeElement {

    public MazeElement() {
        message();
    }

    protected abstract void message();
}
