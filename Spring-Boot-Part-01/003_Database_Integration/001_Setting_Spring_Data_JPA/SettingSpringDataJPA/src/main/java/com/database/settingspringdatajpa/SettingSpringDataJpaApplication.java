package com.database.settingspringdatajpa;

import com.database.settingspringdatajpa.entities.Address;
import com.database.settingspringdatajpa.entities.Tag;
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

        user.addTag("tag 1");

        System.out.println(user);
    }
}
