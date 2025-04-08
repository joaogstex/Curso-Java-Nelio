package com.abstractatv.entities.abstracts;

import com.abstractatv.entities.enums.Color;

public abstract class Shape {
    private Color color;
    public abstract double area();
    
    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "" + color;
    }

}
