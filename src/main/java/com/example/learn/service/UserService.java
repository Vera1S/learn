package com.example.learn.service;

import com.example.learn.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    List<User> findAll();

    Optional<User> findById(Long id);
    Optional<User> create(User user);

    void deleteById(Long id);
    Optional<User> update(Long id, User user);

}
