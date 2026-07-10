package com.sh.registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RegistrationServiceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RegistrationServiceApplication.class, args);

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "s@gmail.com", "12345", "siyam hossain"));

        var userService2 = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "s@gmail.com", "12345", "siyam hossain"));
    }

}
