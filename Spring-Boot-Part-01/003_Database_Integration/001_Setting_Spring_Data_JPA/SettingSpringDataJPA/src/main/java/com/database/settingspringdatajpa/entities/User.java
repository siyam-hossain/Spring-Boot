package com.database.settingspringdatajpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    // a user can't have duplicate tags
    // for many-to-many relationship either part can be owner
    // for many-to-many relationship we use join-table instead of join-column
    @ManyToMany
    @JoinTable(
            name = "user_tags",
            // foreign key of current table which is present on table: "user_tags"
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    public void addTag(String tagName) {
        var tag = new Tag(tagName);
        tags.add(tag);
        tag.getUser().add(this);
    }
    public void removeTag(String tagName) {
        var tag = new Tag(tagName);
        tags.remove(tag);
        tag.getUser().remove(this);
    }


}
