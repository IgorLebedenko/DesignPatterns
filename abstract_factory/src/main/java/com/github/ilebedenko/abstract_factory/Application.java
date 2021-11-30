package com.github.ilebedenko.abstract_factory;

import com.github.ilebedenko.abstract_factory.factory.MacFactory;
import com.github.ilebedenko.abstract_factory.factory.WinFactory;

public class Application {
    public static void main(String[] args) {
        System.out.println("--- CREATING WIN APPLICATION ---");
        new GUIApplication(new WinFactory()).createUI();
        System.out.println("--- CREATING MacOS APPLICATION ---");
        new GUIApplication(new MacFactory()).createUI();
    }
}
