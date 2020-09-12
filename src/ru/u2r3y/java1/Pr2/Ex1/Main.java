package ru.u2r3y.java1.Pr2.Ex1;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape("Green", 5);
//        Shape shape2 = new Shape("Black", 3);
//        System.out.println(shape.getColor());
//        shape.setColor("Blue");
//        System.out.println(shape.getSidesCount());
        Dog dog1 = new Dog("Charlie", 6);
        Dog dog2 = new Dog("Max", 5);
        Dog dog3 = new Dog("Bella", 4);
        Dog dog4 = new Dog("Molly", 3);
        DogKennel nursery = new DogKennel();
        nursery.add(dog1, dog2, dog3, dog4);
        System.out.println("Age " + dog1.getName() + " into human = " + dog1.intoHuman());
        System.out.println("Age " + dog2.getName() + " into human = " + dog2.intoHuman());
        System.out.println("Age " + dog3.getName() + " into human = " + dog3.intoHuman());
        System.out.print("Age " + dog4.getName() + " into human = " + dog4.intoHuman());
    }
}
