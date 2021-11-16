package com.github.ilebedenko.builder.maze;

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
