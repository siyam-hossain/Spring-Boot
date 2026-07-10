package com.sh.registrationservice;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
