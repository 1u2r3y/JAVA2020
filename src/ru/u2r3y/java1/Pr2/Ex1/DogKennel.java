package ru.u2r3y.java1.Pr2.Ex1;

public class DogKennel {
    private Dog dogs[] = new Dog[1000];
    private int SIZE = 0;
    public void add(Dog ... newDogs){
        for (int i = 0; i < newDogs.length; i++) {
            dogs[SIZE] = newDogs[i];
            SIZE++;
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.println(dogs[i].toString());
        }
    }
}
