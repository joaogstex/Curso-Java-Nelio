package com.abstractatv.entities;

import com.abstractatv.entities.abstracts.Shape;
import com.abstractatv.entities.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double a = Math.PI * Math.pow(radius, 2);
        return a;
    }

    @Override
    public String toString() {
        return String.format("%.2f", area());
    }

}
