package com.github.ilebedenko.factory_method.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Add action on click to Windows Button");
    }
}
