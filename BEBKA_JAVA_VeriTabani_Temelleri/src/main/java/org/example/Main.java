package org.example;

import org.example.config.DataBaseConfig;
import org.example.config.DataBaseConnecterConfig;
import org.example.dao.UserDAOImpl;
import org.example.user.User;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try{
            DataBaseConnecterConfig.setConnection();
            Connection connection = DataBaseConnecterConfig.getConnection();
            UserDAOImpl userDAO =  new UserDAOImpl(connection);
 //           userDAO.createTable();
            User user = new User(0,"Helin","helin@gmail.com");
            userDAO.save(user);

            List<User> users = userDAO.findAll();
            for (User u : users) {
                System.out.println(u.getId() + " | " + u.getName() + " | " + u.getEmail());
            }

            userDAO.update(new User(1, "Ali Güncellenmiş", "yeni@example.com"));
            userDAO.delete(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}