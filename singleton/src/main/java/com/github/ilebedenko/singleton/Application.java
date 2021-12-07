package com.github.ilebedenko.singleton;

public class Application {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo!");
        System.out.println(singleton.getValue());
        singleton = Singleton.getInstance("Bar!");
        System.out.println(singleton.getValue());
    }
}
