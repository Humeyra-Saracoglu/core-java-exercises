package Default;

import Helin.Ogrenci;

public class Test {
    public static void main(String[] args) {
        // Bir sınıf var. Biz bir sınıfın içindeki değişkenlere erişebilmek için
        // o classtan nesne türetmemiz gerekiyor. new

        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci1.id = 233452545;
        ogrenci1.isim = "Helin Hümeyra";
        ogrenci1.soyisim = "Saraçoğlu";

        System.out.println("Öğrencinin Bilgileri ");
        System.out.println("ID      : " + ogrenci1.id);
        System.out.println("İsim    : " + ogrenci1.isim);
        System.out.println("Soyisim : " + ogrenci1.soyisim);
    }
}
