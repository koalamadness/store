package com.cs.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");

        int num1 = 7;
        int num2 = 2;

        double result = num1 / num2;
        System.out.println(result);
        System.out.println("Amount: " + amount);
    }
}
