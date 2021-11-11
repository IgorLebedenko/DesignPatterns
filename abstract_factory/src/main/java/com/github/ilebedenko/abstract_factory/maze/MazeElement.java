package com.github.ilebedenko.abstract_factory.maze;

public abstract class MazeElement {

    public MazeElement() {
        message();
    }

    protected abstract void message();
}
