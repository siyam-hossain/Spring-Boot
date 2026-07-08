package com.sh.thespringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TheSpringIoCContainerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TheSpringIoCContainerApplication.class, args);
        var orderService =  context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
