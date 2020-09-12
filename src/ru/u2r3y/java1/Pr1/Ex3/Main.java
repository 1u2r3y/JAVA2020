package ru.u2r3y.java1.Pr1.Ex3;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            k += array[i];
        }
        System.out.println(k);
        int j = 0;
        int k1 = 0;
        while (j < array.length) {
            k1 += array[j];
            j++;
        }
        System.out.println(k1);
        int k2 = 0;
        int l = 0;
        do {
            k2 += array[l];
            l++;
        } while (l < array.length);
        System.out.println(k2);
    }
}