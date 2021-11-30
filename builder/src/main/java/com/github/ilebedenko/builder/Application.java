package com.github.ilebedenko.builder;

import com.github.ilebedenko.builder.builder.CarBuilder;
import com.github.ilebedenko.builder.builder.CarManualBuilder;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("--- CREATING CAR ---");
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        System.out.println(carBuilder.getResult());

        System.out.println("--- CREATING CAR MANUAL ---");
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);
        System.out.println(carManualBuilder.getResult());

    }
}
