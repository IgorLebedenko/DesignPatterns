package com.github.ilebedenko.abstract_factory.checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Paint Windows style checkbox");
    }
}
