package com.database.settingspringdatajpa;

import com.database.settingspringdatajpa.entities.Address;
import com.database.settingspringdatajpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SettingSpringDataJpaApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SettingSpringDataJpaApplication.class, args);
        var user = User.builder()
                .username("admin")
                .password("admin")
                .email("admin@gmail.com")
                .build();

        var address = Address.builder()
                .street("123 Main St")
                .city("Main St")
                .state("Main St")
                .zip("12345")
                .build();

        user.addAddress(address);
        System.out.println(user);

        user.removeAddress(address);
        System.out.println(user);

    }
}
