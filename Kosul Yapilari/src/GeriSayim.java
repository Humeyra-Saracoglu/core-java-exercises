public class GeriSayim {
    public static void main(String[] args) {
        // Amaç: while döngüsü ile 10'dan 1'e kadar geri saymak

        int i = 10;            // Başlangıç değeri

        while (i >= 1) {       // Koşul: i 1'e eşit veya büyük olduğu sürece döngü devam eder
            System.out.println(i);
            i--;               // Her turda i'yi 1 azalt
        }
    }
}
