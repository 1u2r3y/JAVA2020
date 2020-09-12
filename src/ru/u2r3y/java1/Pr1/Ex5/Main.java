package ru.u2r3y.java1.Pr1.Ex5;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<11; i++){
            double v = 1.0/i;
            String m = String.format("%.2f",v);
            System.out.println(m + " ");
        }
    }
}