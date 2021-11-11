package com.github.ilebedenko.abstract_factory.wall;

public class SimpleWall extends Wall {

    @Override
    protected void message() {
        System.out.println("Creating a SIMPLE WALL.");
    }
}
