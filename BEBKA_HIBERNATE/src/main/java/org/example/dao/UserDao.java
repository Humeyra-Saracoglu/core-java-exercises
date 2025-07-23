package org.example.dao;

import org.example.entity.User;

public interface UserDao {
    void createUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(User user);
}
