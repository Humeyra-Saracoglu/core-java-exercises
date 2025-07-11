package org.example;

import org.example.config.DataBaseConfig;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(100)," +
                "email VARCHAR(100))";
        try {
            Connection connection = DriverManager.getConnection(DataBaseConfig.DATABASE_URL,
                    DataBaseConfig.DATABASE_USERNAME, DataBaseConfig.DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Tablo oluşturuldu.");

            // Prepared Statement
            String insertsql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertsql);
            preparedStatement.setString(1, "Helin");
            preparedStatement.setString(2, "helin@gmail.com");
            preparedStatement.execute();

            preparedStatement.setString(1, "Sıla");
            preparedStatement.setString(2, "sıla@gmail.com");
            preparedStatement.execute();

            //result set
            String selectsql = "SELECT * FROM users";
            PreparedStatement prepared = connection.prepareStatement(selectsql);
            ResultSet resultSet = prepared.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("email"));
                System.out.println("---------------------");
            }

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}