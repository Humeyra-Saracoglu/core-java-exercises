import java.util.Scanner;

public class HarfNotu {
    public static void main(String[] args) {
        // Amaç: switch-case kullanarak sayı notunu harf notuna dönüştürmek

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan not al
        System.out.print("0-100 arasında bir not girin: ");
        int not = input.nextInt();

        // Geçerli aralıkta mı kontrol et
        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not! 0 ile 100 arasında bir değer giriniz.");
        } else {
            // switch-case ile harf notu belirle
            switch (not / 10) {
                case 10: // 100 puan
                case 9:
                    System.out.println("Harf notu: A");
                    break;
                case 8:
                    System.out.println("Harf notu: B");
                    break;
                case 7:
                    System.out.println("Harf notu: C");
                    break;
                case 6:
                    System.out.println("Harf notu: D");
                    break;
                default:
                    System.out.println("Harf notu: F");
                    break;
            }
        }

        input.close();
    }
}
