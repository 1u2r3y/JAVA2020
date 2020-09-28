package ru.u2r3y.java1.Pr7;

public abstract class Dog {
    protected int age;

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
