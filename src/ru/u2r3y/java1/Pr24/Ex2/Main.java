package ru.u2r3y.java1.Pr24.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address address = new Address(scanner.nextLine());
        address.returnAddress();
        System.out.println(address.toString());
    }
}
