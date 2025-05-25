public class Uygulama2 {
    public static void main(String[] args) {
        /* Bir kuruyemişci toptancıdan;
        12 kilo leblebiyi kilosunu 3.5 TL
        25 kilo fındık, kilosunu 15.7 TL
        40 kilo badem, kilosunu 22 TL den almıştır.

        bu ürünleri satarken
        --> leblebinin kilosunu %50 fazlası satmış
        --> fındık ise %40 fazlasına
        --> badem ise, %60 fazlasına satmıştır.

        kuruyemişçi o günkü kazandığı para ile dükkanının kirasını ödemek istemektedir.

        kira tutarı: 500 TL
        kazandığı para 500 TL den yüksek ise kirayı ödeyebilsin değilse ödeyemesin...
        */

        double leblebi = 3.5;
        double findik = 15.7;
        double badem = 22;

        double maliyeTutar = (12*leblebi) + (25*findik) + (40*badem);

        double satisTutar = ((leblebi *1.5)*12) + ((findik*1.4)*25) + ((badem *1.6)*40);

        double karTutar= satisTutar - maliyeTutar;

        if(karTutar>500)
        {
            System.out.println("Kirayı ödeyebilirsiniz :)) ");
        }
        else {
            System.out.println("Kirayı ödeek için yeterli paranız bulunmamaktadır.");
        }

        System.out.println("Maaliyet Tutar : " + maliyeTutar + " ₺");
        System.out.println("Satış Tutar    : " + satisTutar + " ₺");
        System.out.println("Kar Tutar      : " + karTutar + "  ₺");
    }
}
