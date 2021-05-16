package com.example.TwitterClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TwitterClone.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}