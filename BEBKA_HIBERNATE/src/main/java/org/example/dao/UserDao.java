package com.example.dao;

import com.example.entity.User;
package com.example.util;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public void createUser(User user) {
        Session session = com.example.util.HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        System.out.println("✅ Kullanıcı eklendi: " + user.getName());
    }

    public User getUserById(long id) {
        Session session = com.example.util.HibernateUtil.getSessionFactory().openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    public void updateUserEmail(long id, String newEmail) {
        Session session = com.example.util.HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = session.get(User.class, id);
        if (user != null) {
            user.setEmail(newEmail);
            session.update(user);
        }
        tx.commit();
        session.close();
        System.out.println("✏️ Email güncellendi.");
    }

    public void deleteUser(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = session.get(User.class, id);
        if (user != null) {
            session.delete(user);
        }
        tx.commit();
        session.close();
        System.out.println("🗑️ Kullanıcı silindi.");
    }
}
