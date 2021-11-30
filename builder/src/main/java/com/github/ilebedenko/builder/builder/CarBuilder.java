package com.github.ilebedenko.builder.builder;

import com.github.ilebedenko.builder.models.Car;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setGPS() {
        car.setHasGPS(true);
    }

    public Car getResult() {
        return car;
    }
}
