package com.sh.externalizingconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService{

    /*
        To read apiUrl from application.properties
     */
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
