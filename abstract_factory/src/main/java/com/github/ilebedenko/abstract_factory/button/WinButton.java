package com.github.ilebedenko.abstract_factory.button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint Windows style button");
    }
}
