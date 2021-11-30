package com.github.ilebedenko.builder;

import com.github.ilebedenko.builder.builder.Builder;

public class Director {

    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V6");
        builder.setGPS();
    }
}
