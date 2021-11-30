package com.github.ilebedenko.builder.builder;

import com.github.ilebedenko.builder.models.CarManual;

public class CarManualBuilder implements Builder {
    private CarManual manual;

    @Override
    public void reset() {
        manual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeatsInfo(String.format("Info about %s seats", number));
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngineInfo(String.format("Info about %s engine", engine));
    }

    @Override
    public void setGPS() {
        manual.setGpsSystemInfo("Info about GPS system");
    }

    public CarManual getResult() {
        return manual;
    }
}
