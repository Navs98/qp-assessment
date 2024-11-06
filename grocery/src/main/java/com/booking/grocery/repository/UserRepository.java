package com.booking.grocery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.grocery.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User save(org.apache.catalina.User user);
}