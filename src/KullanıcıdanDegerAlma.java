import java.util.Scanner;

public class KullanıcıdanDegerAlma {
    public static void main(String[] args) {
        // scanner metodunu kullanıyoruz
        /*
        nextLine()    -----> String
        nextInt()     -----> Integer
        nextByte()    -----> Byte
        nextFloat()   -----> Float
        nextDouble()  -----> Double
         */

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Adınızı Giriniz:");

        String isim = scanner.nextLine();

        System.out.println("Soyadınızı Giriniz: ");

        String soyisim = scanner.nextLine();

        System.out.println("Adınız ve Soyadınız:  " + isim + " " + soyisim);

        */
        /*
        System.out.println("Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
         */
        System.out.print("Kilonuzu Giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Kilonuz: " + kilo);


    }
}
