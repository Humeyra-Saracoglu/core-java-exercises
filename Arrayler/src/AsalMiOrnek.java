import java.util.Scanner;

public class AsalMiOrnek {
    public static void main(String[] args) {
        // diizninin elemanlarını kullanıcıdan alalım
        // daha sonra diiznin içindeki elemanların asal olanlarını ve olmayanlarını ayrı bir şekilde yazdıralım.

        System.out.println("ASAL SAYI BULMA UYGULAMASINA HOŞGELDİNİZ");
        System.out.println("**************************************************");

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = "";
        String asalOlmayanSayilar = "";

        boolean asalMi = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziUzunluk];

        for (int i=0; i<sayilar.length; i++)
        {
            System.out.print("Dizinin " + i + ". index değerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for(int sayi : sayilar)
        {
            asalMi = true;
                if (sayi < 2)
                {
                    asalMi = false;
                }
                else
                {
                    for (int j=2 ; j<sayi ; j++)
                    {
                        if(sayi % j == 0)
                        {
                            asalMi = false;
                            break;
                        }
                    }
                }

                if (asalMi)
                {
                    asalToplam += 1;
                    asalSayilar += sayi + " ";
                }
                else
                {
                    asalOlmayanToplam += 1;
                    asalOlmayanSayilar += sayi + " ";
                }
            }
            System.out.println("ASAL OLAN  BİLGİLERİ");
            System.out.println("Asal Toplam = " + asalToplam );
            System.out.println("Asal Sayılar = "+ asalSayilar);
            System.out.println("*******************************************************************");

            System.out.println("ASAL OLMAYAN BİLGİLERİ");
            System.out.println("Asal Olmayan Toplam = " + asalOlmayanToplam);
            System.out.println("Asal Olmayan Sayılar = " + asalOlmayanSayilar);

    }
}

