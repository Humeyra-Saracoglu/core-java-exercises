public class ForDongusuKarisikOrnekler {
    public static void main(String[] args) {
        // 1 den 10 a kadar olan çift sayıları yazdır. if(i%2==0) bu fonk. kullanırız
        // 1 den 10 a kakdar olan tek sayıları yazdır. if(i%2==1) bu fonk. kullanırız

/*
        for (int i=1; i<=10; i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
}
*/


        // 1 den 10 a kadar çift olan sayıların toplamı.
        // 1 den 10 a kadar çift olan sayıların toplamı.

/*
        int toplam = 0;
        for (int i=1; i<=10; i++)
        {
            if(i%2==1)
            {
                toplam += i;
            }
        }
        System.out.println("Sonuc : " + toplam);
        }
    }
*/

        // 1 den 20 ya kadar olan sayıların çiftlerine Helin yaz
        // 1
        // Helin
        // 3
        // Helin
        // 5

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Helin");
            } else {
                System.out.println(i);
            }
        }
    }
}