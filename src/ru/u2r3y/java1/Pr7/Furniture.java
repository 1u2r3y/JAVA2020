package ru.u2r3y.java1.Pr7;

public abstract class Furniture {
    protected String material;
    protected String color;

    public Furniture() {
    }

    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
