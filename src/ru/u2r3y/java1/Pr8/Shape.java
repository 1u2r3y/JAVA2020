package ru.u2r3y.java1.Pr8;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected String color;
    protected int x;
    protected int y;


    public Shape(){}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public void generatePosition(int a, int b) {
        x = a;
        y = b;
    }

    public abstract void draw(Graphics2D g);
}
