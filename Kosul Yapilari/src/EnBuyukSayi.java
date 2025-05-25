import java.util.Scanner;

public class EnBuyukSayi {
    public static void main(String[] args) {
        // Amaç: Birden fazla sayıyı karşılaştırmayı öğrenmek

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç sayı al
        System.out.print("1. sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int sayi2 = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int sayi3 = input.nextInt();

        // En büyük sayıyı bul
        int enBuyuk;

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            enBuyuk = sayi1;
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            enBuyuk = sayi2;
        } else {
            enBuyuk = sayi3;
        }

        // Sonucu yazdır
        System.out.println("En büyük sayı: " + enBuyuk);

        input.close();
    }
}
