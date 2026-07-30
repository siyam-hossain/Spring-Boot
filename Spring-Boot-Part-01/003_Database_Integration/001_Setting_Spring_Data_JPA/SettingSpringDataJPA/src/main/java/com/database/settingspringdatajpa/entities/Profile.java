package com.database.settingspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = true, name = "bio")
    private String bio;

    @Column(nullable = true, name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(nullable = true, name = "loyalty_point")
    private Integer loyaltypoint;
}
