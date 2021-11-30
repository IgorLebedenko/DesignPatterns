package com.github.ilebedenko.abstract_factory.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint MacOS style checkbox");
    }
}
