package org.example.wrapper;

public class WrapperOrnek {
    public static void main(String[] args) {

        int sayi = 27;

        Integer wrapperSayi = sayi;

        int yeniSayi = wrapperSayi;

        System.out.println("integer sayi              : " + sayi);
        System.out.println("Integer wrapperSayi       : " + wrapperSayi);
        System.out.println("Unboxing ile int yeniSayi : " + yeniSayi);
    }
}
