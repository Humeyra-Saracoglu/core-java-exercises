package org.example.Hashmap;

import java.util.HashMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> notlar = new HashMap<>();

        notlar.put("Ahmet", 90);
        notlar.put("Ayşe", 85);
        notlar.put("Mehmet", 75);

        for (Map.Entry<String, Integer> entry : notlar.entrySet()) {
            System.out.println(entry.getKey() + " adlı öğrencinin aldığı not : " + entry.getValue());
        }
    }
}
