package ru.u2r3y.java1.Pr28;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}