import java.util.Scanner;

public class Uygulama1 {
    public static void main(String[] args) {
        // vize1 %30
        // vize2  %30
        // final %40
        // GEÇME NOTU 60
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Sosyisminizi Giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Dersi Giriniz: ");
        String dersIsmi = scanner.nextLine();


        System.out.print("Vize1 Notunuzu Giriniz: ");
        double vize1 = scanner.nextDouble();

        System.out.print("Vize2 Notunuzu Giriniz: ");
        double vize2 = scanner.nextDouble();

        System.out.print("Final Notunuzu Giriniz: ");
        double Final = scanner.nextDouble();


        double sonuc = (vize1*0.3) + (vize2*0.3) + (Final*0.4);

        if (sonuc >= 60){
            System.out.print("Tebriklerrr. " + isim + " " + soyisim + " adlı öğrenci " + dersIsmi + " dersinden " + sonuc + " ortalamayla geçmiştir." );
        }
        else {
            System.out.print("Dersten kaldınız :( ");
        }

    }
}
