package com.sh.configurebinsusingannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigureBinsUsingAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigureBinsUsingAnnotationsApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}
