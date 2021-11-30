package com.github.ilebedenko.builder.builder;

public interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(String engine);

    void setGPS();
}
