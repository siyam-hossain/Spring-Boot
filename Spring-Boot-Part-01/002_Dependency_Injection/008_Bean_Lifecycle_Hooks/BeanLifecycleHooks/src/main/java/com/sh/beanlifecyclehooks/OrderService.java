package com.sh.beanlifecyclehooks;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        System.out.println("------------------------------");
        System.out.println("Order service created");
        System.out.println("------------------------------");
        this.paymentService = paymentService;
    }

    @PostConstruct
    public void init(){
        System.out.println("------------------------------");
        System.out.println("Order service post construct");
        System.out.println("------------------------------");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("------------------------------");
        System.out.println("order service pre destroy");
        System.out.println("------------------------------");
    }



    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}