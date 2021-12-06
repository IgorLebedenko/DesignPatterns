package com.github.ilebedenko.prototype;

import com.github.ilebedenko.prototype.shape.Circle;
import com.github.ilebedenko.prototype.shape.Rectangle;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setColor("Red");
        circle.setRadius(5);
        System.out.println(circle.clone());

        Rectangle rectangle = new Rectangle();
        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setColor("Green");
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        System.out.println(rectangle.clone());
    }
}
