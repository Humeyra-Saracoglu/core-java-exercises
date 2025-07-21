package org.example.dao;

import org.example.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private final Connection connection;

    public UserDAOImpl(Connection connection) {
        this.connection = connection;
    }

    // 1. TABLO OLUŞTURMA
    @Override
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(100)," +
                "email VARCHAR(100)";

        try(Statement statement = connection.createStatement()){
            statement.execute(sql);
            System.out.println("Tablo oluşturuldu");
        }
        catch(Exception e){
            throw new RuntimeException("Tablo oluşturulmadı");
        }
    }

    // 2. KAYIT EKLEME
    @Override
    public void save(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.execute();
            System.out.println("Kayıt tamamlandı");
        }
        catch(Exception e){
            throw new RuntimeException("Kayıtta problem oluştu");
        }
    }

    // 3. TÜM KULLANICILARI GETİRME
    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email")
                );
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    // 4. KULLANICI GÜNCELLE

    @Override
    public void update(User user) {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());
            stmt.setInt(3, user.getId());
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Kullanıcı güncellendi: " + user.getId());
            } else {
                System.out.println("Güncellenecek kullanıcı bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 5. KULLANICI SİLME
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("🗑️ Kullanıcı silindi: " + id);
            } else {
                System.out.println("⚠️ Silinecek kullanıcı bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


