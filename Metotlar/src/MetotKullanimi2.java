public class MetotKullanimi2 {
    public static void main(String[] args) {

        // Parametreli ve geriye değer döndürmeyen metor tanımlama

        isimYazdir();
        topla(12, 34);
        isimSoysisimYazdir("Helin", "Saraçoğlu");
    }
    public static void isimSoysisimYazdir(String isim, String soyisim)
    {
        System.out.println("İsim ve Soysisim: " + (isim + " " + soyisim));
    }
    public static void topla(int sayi1, int sayi2)
    {
        int sonuc = sayi1 + sayi2;
        System.out.println("Sonuç: " + sonuc);
    }
    public static void isimYazdir()
    {
        System.out.println("Helin");
    }
}
