package ru.u2r3y.java1.Pr2.Ex1;

public class Ball {
    private int price;
    private double diameter;

    public Ball(int price, double diameter) {
        this.price = price;
        this.diameter = diameter;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + price +
                ", diameter=" + diameter +
                '}';
    }
}
