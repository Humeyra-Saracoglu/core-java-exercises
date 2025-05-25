import java.util.Scanner;

public class ToplamaIslemi {
    public static void main(String[] args) {
        // Amaç: Döngü ve toplama işlemini birlikte kullanmak

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı gir: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            int toplam = 0;
            for (int i = 1; i <= n; i++) {
                toplam += i;  // toplam = toplam + i
            }
            System.out.println("1’den " + n + "’e kadar sayıların toplamı: " + toplam);
        }

        input.close();
    }
}
