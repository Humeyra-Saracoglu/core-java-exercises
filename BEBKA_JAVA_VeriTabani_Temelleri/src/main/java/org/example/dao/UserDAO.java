package org.example.dao;

import org.example.user.User;

import java.util.List;

public interface UserDAO {
    void createTable();
    void save(User user);
    List<User> findAll();
    void update(User user);
    void delete(int id);
}
