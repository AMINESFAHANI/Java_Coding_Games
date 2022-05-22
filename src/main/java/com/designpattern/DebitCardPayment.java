package com.designpattern;

public class DebitCardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("going to do the payment from debit card");
    }
}
