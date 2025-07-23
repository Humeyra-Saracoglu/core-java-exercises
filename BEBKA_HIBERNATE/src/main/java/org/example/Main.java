package org.example;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.entity.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        // 1. Create
        User newUser = new User("Helin", "helin@example.com");
        userDao.createUser(newUser);

        // 2. Read
        User fetched = userDao.getUserById(newUser.getId());

        // 3. Update
        fetched.setEmail("helin.updated@example.com");
        userDao.updateUser(fetched);

        // 4. Delete
        userDao.deleteUser(fetched);
    }
}
