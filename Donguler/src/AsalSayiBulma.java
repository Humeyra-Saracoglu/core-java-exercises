import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        // ASAL sayı bulma
        Scanner scanner = new Scanner(System.in);
        boolean asalMi = false;

        System.out.println("**************ASAL BULMA UYGULAMASINA HOŞGELDİNİZ**********");
        System.out.print("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();

        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                asalMi = false;
                break;
            } else {
                asalMi = true;
            }
        }
        if (asalMi) {
            System.out.println("Girdiğiniz " + sayi + " sayısı asaldır.");
        } else {
            System.out.println("Girdiğiniz " + sayi + " sayısı asal değildir.");
        }

    }
}
