import java.util.Scanner;

public class TekCiftKontrol {
    public static void main(String[] args) {
        // Amaç: Modulus (%) operatörünü kullanarak sayının tek veya çift olduğunu anlamak

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Bir sayı gir: ");
        int sayi = input.nextInt();

        // Modulus operatörü ile kontrol
        if (sayi % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }

        input.close();
    }
}
