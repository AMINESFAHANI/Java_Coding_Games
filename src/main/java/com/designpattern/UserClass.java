package com.designpattern;

import java.util.*;

public class UserClass {
    public static void main(String[] args) {
        Payment paymentMethod = PaymentFactory.getPayment("debitCard");

        paymentMethod.doPayment();
        Map map = new HashMap();
        HashMap hashMap = new HashMap();
        map = new LinkedHashMap();
        hashMap = new LinkedHashMap();


    }


}
