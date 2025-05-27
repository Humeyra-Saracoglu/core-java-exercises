public class WhileDongusu {
    public static void main(String[] args) {
        // 1 den 10 a kadar olan çift sayıları yazdır.-----------------------
/*
                int i = 1;
        while(i<= 10)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i ++;
        }
 */

        // 1 den 10 a kakdar olan tek sayıları yazdır.------------------------
/*
        int i = 1;
        while(i<= 10)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i ++;
        }
 */

        // 1 den 10 a kadar çift olan sayıların toplamı.-----------------------
/*
        int i = 1;
        int toplam = 0;

        while(i<= 10)
        {
            if (i%2==0)
            {
                toplam += i;
            }
            i ++;
        }
        System.out.println("Çift Sayıların toplamı : " + toplam);
*/

        // 1 den 10 a kadar çift olan sayıların toplamı.-----------------------
        /*
        int i = 1;
        int toplam = 0;

        while(i<= 10)
        {
            if (i%2==1)
            {
                toplam += i;
            }
            i ++;
        }
        System.out.println("Çift Sayıların toplamı : " + toplam);
         */


        // 1 den 20 ya kadar olan sayıların çiftlerine Helin yaz
        // 1
        // Helin
        // 3
        // Helin
        // 5
        int i = 1;
        int toplam = 0;

        while(i<= 10)
        {
            if (i%2==0)
            {
                System.out.println("Helin");
            }
            else
            {
                System.out.println(i);
            }
            i ++;
        }


    }
}
