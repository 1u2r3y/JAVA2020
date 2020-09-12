package ru.u2r3y.java1.Pr1.Ex7;

public class Main {
    public static void main (String[] args){
        System.out.print(Fuc(6));
    }
    public static int Fuc(int a){
        int b = 1;
        for (int i = 1; i < a; i++) {
            b*=i;
        }
        return b;
    }
}
