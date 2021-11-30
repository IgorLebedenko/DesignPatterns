package com.github.ilebedenko.factory_method.button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Html Button");
    }

    @Override
    public void onClick() {
        System.out.println("Add action on click to Html Button");
    }
}
