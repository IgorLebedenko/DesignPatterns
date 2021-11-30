package com.github.ilebedenko.builder.models;

import lombok.Setter;

@Setter
public class Car {
    private int seats;
    private String engine;
    private boolean hasGPS;

    @Override
    public String toString() {
        return String.format("Car with:\n\t" +
                " - %s seats\n\t" +
                " - %s engine\n", seats, engine) +
                (hasGPS ? "\t - GPS" : "");
    }
}
