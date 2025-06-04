package org.example.Lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        sayilar.forEach(sayi -> System.out.println(sayi));
    }
}
