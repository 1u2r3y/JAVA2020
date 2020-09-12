package ru.u2r3y.java1.Pr1.Ex6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    int a [] = new int[12];
    //первый способ через метод random() класса Math
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) (Math.random()*100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //второй способ через класс Random
        Random r = new Random(1234);
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}