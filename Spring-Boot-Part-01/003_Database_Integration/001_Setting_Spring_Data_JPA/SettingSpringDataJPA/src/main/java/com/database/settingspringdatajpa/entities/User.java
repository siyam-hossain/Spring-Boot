package com.database.settingspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;


    // A user can have many addresses
    @OneToMany(mappedBy = "user")
    // A user not necessary know about address
    @Builder.Default
    // we are telling the builder to include the below statement or initialization when building an object
    private List<Address> addresses = new ArrayList<>();

    // let's wire the objects together
    public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
        address.setUser(null);
    }

}
