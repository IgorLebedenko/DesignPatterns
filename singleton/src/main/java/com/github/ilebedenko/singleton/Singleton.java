package com.github.ilebedenko.singleton;

import lombok.Getter;

public class Singleton {
    private static volatile Singleton instance;

    @Getter
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton(value);
            }
        }
        return instance;
    }
}
