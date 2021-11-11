package com.github.ilebedenko.design_patterns.creational.abstract_factory.wall;

public class MagicWall extends Wall {

    @Override
    protected void message() {
        System.out.println("Creating a MAGIC WALL. Be careful and don't touch it!");
    }
}
