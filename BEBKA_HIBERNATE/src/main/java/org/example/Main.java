package com.example;

import com.example.dao.UserDao;
import com.example.entity.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // CREATE
        User user = new User("Helin", "helin@example.com");
        userDao.createUser(user);

        // READ
        User dbUser = userDao.getUserById(user.getId());
        System.out.println("📄 Veritabanından gelen kullanıcı: " + dbUser.getName());

        // UPDATE
        userDao.updateUserEmail(user.getId(), "yeni_mail@example.com");

        // DELETE
        userDao.deleteUser(user.getId());
    }
}
