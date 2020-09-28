package ru.u2r3y.java1.Pr7;

public abstract class Furniture {
    protected int price;

    public Furniture() {
    }

    public Furniture(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                '}';
    }
}
