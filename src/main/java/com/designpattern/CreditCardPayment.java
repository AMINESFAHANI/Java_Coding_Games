package com.designpattern;

public class CreditCardPayment implements Payment{
    @Override
    public void doPayment() {

        System.out.println("going to do the payment from credit card");
    }
}
