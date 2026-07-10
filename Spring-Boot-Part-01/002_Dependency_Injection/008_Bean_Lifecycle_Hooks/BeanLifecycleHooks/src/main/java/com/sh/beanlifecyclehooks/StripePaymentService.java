package com.sh.beanlifecyclehooks;


import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService{

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.supported-currencies}")
    private List<String> currency;

    @Value("${stripe.timeout}")
    private int timeout;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIP");
        System.out.println("Amount: "+amount);

        System.out.println("api: "+apiUrl);
        System.out.println("enabled: "+enabled);
        System.out.println("currency: "+currency);
        System.out.println("timeout: "+timeout);

    }
}
