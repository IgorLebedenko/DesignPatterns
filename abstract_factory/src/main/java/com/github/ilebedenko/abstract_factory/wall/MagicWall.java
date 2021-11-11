package com.github.ilebedenko.abstract_factory.wall;

public class MagicWall extends Wall {

    @Override
    protected void message() {
        System.out.println("Creating a MAGIC WALL. Be careful and don't touch it!");
    }
}
