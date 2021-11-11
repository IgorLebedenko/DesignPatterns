package com.github.ilebedenko.design_patterns.creational.abstract_factory.wall;

public class SimpleWall extends Wall {

    @Override
    protected void message() {
        System.out.println("Creating a SIMPLE WALL.");
    }
}
