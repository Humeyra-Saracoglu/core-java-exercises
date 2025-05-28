import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        // Girilen sayıların tek mi çift mi olduklarını bulalım ve Ekrana yazdıralım.
        // koşul, döngü, dizi, method, scanner konularını kullanmaya çalışacağız.

        System.out.println("SAYININ TEK Mİ ÇİFT Mİ OLDUĞUNU BULMA PROGRAMI");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman saysıını giriniz: ");
        int diziLength = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziLength];

        for(int i=0; i< sayilar.length; i++)
        {
            System.out.print("Dizinin " + i + "i index değerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for(int deger : sayilar)
        {
            tekMiCiftMi(deger);
        }
    }
    public static void tekMiCiftMi(int sayi)
    {
        if(sayi%2==0)
        {
            System.out.println("Sayı: " + sayi + " ÇİFTTİR");
        }
        else
        {
            System.out.println("Sayı: " + sayi + " TEKTİR.");
        }
    }
}
