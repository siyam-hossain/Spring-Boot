package com.sh.externalizingconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExternalizingConfigurationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExternalizingConfigurationApplication.class, args);
        var order = context.getBean(StripePaymentService.class);
        order.processPayment(50);
    }

}
