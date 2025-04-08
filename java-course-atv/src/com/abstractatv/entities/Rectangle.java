package com.abstractatv.entities;

import com.abstractatv.entities.abstracts.Shape;
import com.abstractatv.entities.enums.Color;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
       double a = height * width;
       return a;
    }

    @Override
    public String toString() {
        return "" + area();
    }
    
}
