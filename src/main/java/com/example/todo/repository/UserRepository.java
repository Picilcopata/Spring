package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.todo.entity.user.User;


public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
