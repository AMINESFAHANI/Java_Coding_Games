package com.designpattern;

public class PaymentFactory {


    public static  Payment  getPayment(String paymentMethod) {
        if(paymentMethod=="creditCard") return new CreditCardPayment();
        else if(paymentMethod=="debitCard") return new DebitCardPayment();

        else return null;

    }
}
