package com.sh.lazyinitialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LazyInitializationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LazyInitializationApplication.class, args);
        var resource = context.getBean(HeavyResource.class);
    }

}
