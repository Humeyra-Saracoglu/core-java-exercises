import java.util.Scanner;

public class AtmUygulamasi {
    public static void main(String[] args) {
        String islemSecenekleri = "Bakiye Görüntüleme ---> 1\n"
                + "Para çekmek ---> 2\n"
                + "Farklı hesaba para yatırmak ---> 3\n"
                + "Çıkış için q tuşuna basınız";

        Scanner scanner = new Scanner(System.in);

        double bilalBakiye = 2450;
        String bilalIBAN = "TR1256 0958 939 279 931 1212 13 03";
        String bilalKullanici = "bilal12";
        String bilalSifre = "123";

        double enesBakiye = 1200;
        String enesIBAN = "TR1234 000 567 985 345 6572 28 82";
        String enesKullanici = "enes55";
        String enesSifre = "456";

        System.out.println("ATM'ye HOŞGELDİNİZ.");
        System.out.println("Lütfen bilgilerinizi eksiksiz giriniz.");

        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals(bilalKullanici) && sifre.equals(bilalSifre)) {
            System.out.println("Bilal Çamur Hesabına giriş yapıldı...");
            System.out.println(islemSecenekleri);

            System.out.print("Lütfen bir seçim yapınız: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + bilalBakiye);
                    break;

                case "2":
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    int cekilecekTutar = scanner.nextInt();
                    if (bilalBakiye >= cekilecekTutar) {
                        bilalBakiye -= cekilecekTutar;
                        System.out.println("Para çekildi. Kalan bakiye: " + bilalBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para çekemezsiniz...");
                    }
                    break;

                case "3":
                    System.out.print("Ne kadar yatırmak istiyorsunuz: ");
                    int yatirilacakTutar = scanner.nextInt();
                    scanner.nextLine(); // dummy read
                    if (yatirilacakTutar <= bilalBakiye) {
                        System.out.print("IBAN Giriniz: ");
                        String yatirilacakIBAN = scanner.nextLine();
                        if (yatirilacakIBAN.equals(enesIBAN)) {
                            bilalBakiye -= yatirilacakTutar;
                            enesBakiye += yatirilacakTutar;
                            System.out.println("Para yatırıldı. Yeni bakiye: " + bilalBakiye);
                        }
                    }
                    break;

                default:
                    System.out.println("Geçersiz seçim.");
            }

        } else if (kullaniciAdi.equals(enesKullanici) && sifre.equals(enesSifre)) {
            System.out.println("Enes Bayram Hesabına giriş yapıldı...");
            System.out.println(islemSecenekleri);

            System.out.print("Lütfen bir seçim yapınız: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + enesBakiye);
                    break;

                case "2":
                    System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                    int cekilecekTutar = scanner.nextInt();
                    if (enesBakiye >= cekilecekTutar) {
                        enesBakiye -= cekilecekTutar;
                        System.out.println("Para çekildi. Kalan bakiye: " + enesBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para çekemezsiniz...");
                    }
                    break;

                case "3":
                    System.out.print("Ne kadar yatırmak istiyorsunuz: ");
                    int yatirilacakTutar = scanner.nextInt();
                    scanner.nextLine(); // dummy read
                    if (yatirilacakTutar <= enesBakiye) {
                        System.out.print("IBAN Giriniz: ");
                        String yatirilacakIBAN = scanner.nextLine();
                        if (yatirilacakIBAN.equals(bilalIBAN)) {
                            enesBakiye -= yatirilacakTutar;
                            bilalBakiye += yatirilacakTutar;
                            System.out.println("Para yatırıldı. Yeni bakiye: " + enesBakiye);
                        }
                    }
                    break;

                default:
                    System.out.println("Geçersiz seçim.");
            }

        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış!!");
        }
    }
}
