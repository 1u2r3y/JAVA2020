package ru.u2r3y.java1.Pr7;

public class Sofa extends Furniture{
    protected String size;
    protected double price;

    public Sofa(String material, String color, String size, double price) {
        super(material, color);
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
