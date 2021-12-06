package com.github.ilebedenko.prototype.shape;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return String.format("%s rectangle with top-left angle in (%d,%d), width=%d and height=%d",
                getColor(), getX(), getY(), width, height);
    }
}
