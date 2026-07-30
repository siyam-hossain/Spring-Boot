package com.database.settingspringdatajpa.entities;


import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false, name = "street")
    private String street;

    @Column(nullable = false, name = "city")
    private String city;

    @Column(nullable = false, name = "zip")
    private String zip;

    @Column(nullable = false, name = "state")
    private String state;


    @ManyToOne
    @JoinColumn(name = "user_id")
    // an address should know about a user
    @ToString.Exclude
    // to avoid string conversion
    private User user;

}
