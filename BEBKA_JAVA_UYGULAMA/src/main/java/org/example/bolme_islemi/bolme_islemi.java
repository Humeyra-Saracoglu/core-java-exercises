package org.example.bolme_islemi;

import java.util.Scanner;

public class bolme_islemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Birinci sayıyı girin: ");
            int sayi1 = scanner.nextInt();

            System.out.print("İkinci sayıyı girin: ");
            int sayi2 = scanner.nextInt();

            int sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayı sıfıra bölünemez!");
        }
    }
}
