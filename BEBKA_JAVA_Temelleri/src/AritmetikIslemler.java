import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {
        // Amaç: Toplama, çıkarma, çarpma ve bölme işlemlerini yapmayı öğrenmek

        Scanner input = new Scanner(System.in);


        System.out.print("Birinci sayıyı gir: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı gir: ");
        double sayi2 = input.nextDouble();


        double toplam = sayi1 + sayi2;
        double cikarma = sayi1 - sayi2;
        double carpma = sayi1 * sayi2;
        String bolme;

        if (sayi2 != 0) {
            bolme = String.valueOf(sayi1 / sayi2);
        } else {
            bolme = "Tanımsız (sıfıra bölme hatası)";
        }


        System.out.println("\nİşlem Sonuçları:");
        System.out.println("Toplama: " + toplam);
        System.out.println("Çıkarma: " + cikarma);
        System.out.println("Çarpma: " + carpma);
        System.out.println("Bölme: " + bolme);

        input.close();
    }
}
