package ru.u2r3y.java1.Pr2.Ex1;

public class Shape {
    private String color;
    private int sidesCount;
    public Shape(String color, int sidesCount) {
        this.color=color;
        this.sidesCount=sidesCount;
    }
    public String getColor() {
        return color;
    }
    public int getSidesCount() {
        return sidesCount;
    }
    public void setColor(String color) {
        if (Math.random()>50) {
            this.color=color;
        }
    }
    public void setSidesCount(int sidesCount) {
        this.sidesCount = sidesCount;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", sidesCount=" + sidesCount +
                '}';
    }
}
