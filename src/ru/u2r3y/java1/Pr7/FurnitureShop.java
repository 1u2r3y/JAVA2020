package ru.u2r3y.java1.Pr7;

import java.util.Arrays;

public class FurnitureShop {
    public Sofa[] sofas;
    public FurnitureShop(Sofa[] sofas){
        this.sofas = sofas;
    }

    public Sofa[] getSofas() {
        return sofas;
    }

    public void setSofas(Sofa[] sofas) {
        this.sofas = sofas;
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "sofas=" + Arrays.toString(sofas) +
                '}';
    }
}
