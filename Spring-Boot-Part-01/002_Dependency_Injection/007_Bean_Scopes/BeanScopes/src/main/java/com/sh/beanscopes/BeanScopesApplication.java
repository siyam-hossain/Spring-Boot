package com.sh.beanscopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScopesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanScopesApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);


    }

}
