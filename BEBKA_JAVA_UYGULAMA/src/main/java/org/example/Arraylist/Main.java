package org.example.Arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<>();


        sehirler.add("Bursa");
        sehirler.add("Van");
        sehirler.add("İstanbul");

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }
    }
}
