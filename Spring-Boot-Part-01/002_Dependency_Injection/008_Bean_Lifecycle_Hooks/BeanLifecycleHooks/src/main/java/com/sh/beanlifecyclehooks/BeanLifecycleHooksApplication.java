package com.sh.beanlifecyclehooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeanLifecycleHooksApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(BeanLifecycleHooksApplication.class, args);

        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);

        context.close();
    }

}
