package ru.u2r3y.java1.Pr3.Ex1;

import ru.u2r3y.java1.Pr3.Ex1.Circle;

public class CircleTest {
    public static void main (String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getRadius());
        circle.setRadius(5);
        System.out.println(circle.getRadius());
        double lenght = 2 * Math.PI * circle.getRadius();
        double area = Math.PI* Math.pow(circle.getRadius(), 2) ;
        System.out.println("length = " + lenght + ", area = " + area);
    }
}
