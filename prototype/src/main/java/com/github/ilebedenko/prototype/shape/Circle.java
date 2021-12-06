package com.github.ilebedenko.prototype.shape;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Circle extends Shape {
    private int radius;

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return String.format("%s circle with center in (%d,%d) and radius=%d",
                getColor(), getX(), getY(), radius);
    }
}
