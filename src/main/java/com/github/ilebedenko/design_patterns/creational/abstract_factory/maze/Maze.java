package com.github.ilebedenko.design_patterns.creational.abstract_factory.maze;

import com.github.ilebedenko.design_patterns.creational.abstract_factory.room.Room;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getNumber(), room);
    }

    public Room getRoom(int number) {
        return rooms.get(number);
    }
}
