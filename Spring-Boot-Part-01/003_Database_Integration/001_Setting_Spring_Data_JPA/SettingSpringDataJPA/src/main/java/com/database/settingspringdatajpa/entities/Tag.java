package com.database.settingspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    // the "tags" comes form User entity Set--->tags
    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
    private Set<User> user = new HashSet<>();

    public Tag(String name) {
        this.name = name;
    }
}
