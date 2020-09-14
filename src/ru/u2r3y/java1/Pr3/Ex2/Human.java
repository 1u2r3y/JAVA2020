package ru.u2r3y.java1.Pr3.Ex2;

public class Human {

    public static void main (String[] args){
        Human human = new Human();
        Leg leg = new Leg(39, true);
        Head head = new Head(90,true ,"small","black");
        Hand hand = new Hand("long","clean");
        Body body = new Body(172, 61, "M");
        System.out.println(body.getHeight() + " " + leg.getSize() + " " + head.getIQ() + " " + hand.getLength());
    }
}
