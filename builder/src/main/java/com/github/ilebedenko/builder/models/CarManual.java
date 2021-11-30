package com.github.ilebedenko.builder.models;

import lombok.Setter;

@Setter
public class CarManual {
    private String seatsInfo;
    private String engineInfo;
    private String gpsSystemInfo;

    @Override
    public String toString() {
        return String.format("Car Manual:\n\t" +
                " - %s\n\t" +
                " - %s\n", seatsInfo, engineInfo) +
                (gpsSystemInfo != null ? "\t - " + gpsSystemInfo : "");
    }
}
