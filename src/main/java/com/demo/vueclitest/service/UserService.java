package com.demo.vueclitest.service;

import com.demo.vueclitest.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void update(User user);
    void delete(String id);
    List<User> findAll ();
    User findById(String id);
}

