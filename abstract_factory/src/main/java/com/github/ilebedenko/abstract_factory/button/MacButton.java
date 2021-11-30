package com.github.ilebedenko.abstract_factory.button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Paint MacOS style button");
    }
}
