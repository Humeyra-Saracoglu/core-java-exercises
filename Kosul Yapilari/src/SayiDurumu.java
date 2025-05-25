import java.util.Scanner;

public class SayiDurumu {
    public static void main(String[] args) {
        // Amaç: if-else karar yapısını kullanarak sayının durumunu belirlemeyi öğrenmek

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Bir sayı gir: ");
        int sayi = input.nextInt();

        // if-else ile sayının durumunu belirle
        if (sayi > 0) {
            System.out.println("Pozitif sayı");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Sayı sıfır");
        }

        input.close();
    }
}
