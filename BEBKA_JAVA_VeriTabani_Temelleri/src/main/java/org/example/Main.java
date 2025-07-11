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

            // == Prepared Statement ==
            String insertsql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertsql);
            preparedStatement.setString(1, "Helin");
            preparedStatement.setString(2, "helin@gmail.com");
            preparedStatement.execute();

            preparedStatement.setString(1, "Sıla");
            preparedStatement.setString(2, "sıla@gmail.com");
            preparedStatement.execute();

            // == Result set ==
            String selectsql = "SELECT * FROM users";
            PreparedStatement prepared = connection.prepareStatement(selectsql);
            ResultSet resultSet = prepared.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("email"));
                System.out.println("---------------------");
            }

            // === UPDATE İşlemleri ===
            String updateSql = "UPDATE users SET name = ? WHERE id = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateSql);
            updateStatement.setString(1, "Güncellenmiş Helin");
            updateStatement.setInt(2, 1); // id = 1 olan kullanıcıyı güncelledik
            int updatedRows = updateStatement.executeUpdate();
            System.out.println("Güncellenen satır sayısı: " + updatedRows);

            // === DELETE İşlemleri ===
            String deleteSql = "DELETE FROM users WHERE id = ?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSql);
            deleteStatement.setInt(1, 2); // id = 2 olan kullanıcı sildik
            int deletedRows = deleteStatement.executeUpdate();
            System.out.println("Silinen satır sayısı: " + deletedRows);

            // === Kontrol İşlemi için  ===
            System.out.println("Güncelleme/Silme sonrası kullanıcılar:");
            ResultSet finalResultSet = statement.executeQuery("SELECT * FROM users");
            while (finalResultSet.next()) {
                System.out.println(finalResultSet.getInt("id"));
                System.out.println(finalResultSet.getString("name"));
                System.out.println(finalResultSet.getString("email"));
                System.out.println("---------------------");
            }

            // === Kapatmalar ===
            updateStatement.close();
            deleteStatement.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}