package com.sh.beansusingcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansUsingCodeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeansUsingCodeApplication.class, args);
        var order = context.getBean(OrderService.class);
        order.placeOrder();
    }

}
