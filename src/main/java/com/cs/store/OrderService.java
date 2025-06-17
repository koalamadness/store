package com.cs.store;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    public PaymentService paymentService;

  public OrderService(PaymentService paymentService){
    this.paymentService = paymentService;
  }

    public void placeOrder(){
       // var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    
}
