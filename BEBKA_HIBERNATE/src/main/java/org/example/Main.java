package org.example;

import org.example.util.HibernateUtil;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("✅ Hibernate bağlantısı başarılı!");
        } catch (Exception e) {
            System.err.println("⛔ Bağlantı hatası: " + e.getMessage());
        } finally {
            if (session != null) session.close();
        }
    }
}